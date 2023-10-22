using System;
using System.Collections.Generic;
using System.Windows.Forms;
using Moq;
using NUnit.Framework;
using TestProject1;

namespace TestProject1
{
    [TestFixture]
    public class AverageTest
    {
        Average average = new Average();

        [Test]
        public void CorrectListAverage()
        {
            double expected = 2;
            List<int> list = new List<int>() { 1, 2, 3 };
            Assert.AreEqual(Average.ListAverage(list), expected);

        }
        [Test]
        public void CorrectCompareLists()
        {
            string message1 = "Среднее значение списка 1 больше списка 2";
            string message2 = "Среднее значение списка 2 больше списка 1";
            string message3 = "Средние значения списокв равны";

            //Тест случая, когда список 1 больше списка 2
            List<int> list1 = new List<int>() { 4, 5, 6 };
            List<int> list2 = new List<int>() { 1, 2, 3 };
            string currentMessage1 = Average.CompareLists(list1, list2);
            Assert.AreEqual(message1, currentMessage1);

            // Тест случая, когда список 2 больше списка 1
            string currentMessage2 = Average.CompareLists(list2, list1);
            Assert.AreEqual(message2, currentMessage2);

            //Тест случая, когда списки равны
            List<int> list3 = new List<int>() { 1, 1, 1 };
            List<int> list4 = new List<int>() { 1, 1, 1 };
            average.SetFirstList(list1);
            average.SetSecondList(list2);
            string currentMessage3 = Average.CompareLists(list3, list4);
            Assert.AreEqual(message3, currentMessage3);
        }
        [Test]
        public void CorrectGetFirstList()
        {
            int[] array1 = { 1, 2, 3 };
            int[] array2 = { 4, 5, 6 };
            Average average = new Average(array1.ToList(), array2.ToList());
            List<int> expected = new List<int>() { 1, 2, 3 };
            Assert.AreEqual(expected, average.GetFirstList());
        }
        [Test]
        public void CorrectGetSecondList()
        {
            int[] array1 = { 1, 2, 3 };
            int[] array2 = { 4, 5, 6 };
            Average average = new Average(array1.ToList(), array2.ToList());
            List<int> expected = new List<int>() { 4, 5, 6 };
            Assert.AreEqual(expected, average.GetSecondList());
        }
        [Test]
        public void CorrectSetFirstList()
        {
            int[] array1 = { 1, 2, 3 };
            Average average = new Average();
            List<int> expected = array1.ToList();
            average.SetFirstList(expected);
            Assert.AreEqual(expected, average.GetFirstList());
        }
        [Test]
        public void CorrectSetSecondList()
        {
            int[] array1 = { 1, 2, 3 };
            Average average = new Average();
            List<int> expected = array1.ToList();
            average.SetSecondList(expected);
            Assert.AreEqual(expected, average.GetSecondList());
        }
    }
    // Пока не разобрался, как использовать мок в С#, поэтому тесты не смог сделать((
    public class LogicTest
    {
    }

    public class U1ITest
    {
        private UI userInput;

        [SetUp]
        public void SetUp()
        {
            userInput = new UI();
        }
        [Test]
        public void CreateList_InputValidNumbers_ReturnsList()
        {
            // Arrange
            string userInput = "1 2 3 4 5";
            List<int> expectedList = new List<int> { 1, 2, 3, 4, 5 };

            // Act
            using (var sw = new StringWriter())
            {
                Console.SetOut(sw);
                using (var sr = new StringReader(userInput))
                {
                    Console.SetIn(sr);

                    List<int> actualList = UI.CreateList();

                    // Assert
                    Assert.AreEqual(expectedList, actualList);
                }
            }
        }
    }
}

