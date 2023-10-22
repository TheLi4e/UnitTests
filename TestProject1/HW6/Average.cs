
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestProject1
{
    public class Average
    {
        private List<int> _firstList;
        private List<int> _secondList;

        public Average(List<int> firstList, List<int> secondList)
        {
            _firstList = firstList;
            _secondList = secondList;
        }

        public Average() { }

        public List<int> GetFirstList()
        {
            return _firstList;
        }
        public List<int> GetSecondList()
        {
            return _secondList;
        }

        public List<int> SetFirstList(List<int> firstList) => _firstList = firstList;
        public List<int> SetSecondList(List<int> secondList) => _secondList = secondList;

        /// <summary>
        /// Метод для вычисления среднего значения списка
        /// </summary>
        /// <param name="myList"> Исходный список</param>
        /// <returns>Среднее значение в списке</returns>
        /// <exception cref="Exception"></exception>
        public static double ListAverage(List<int> myList)
        {
            if (myList.Count < 0)
                throw new Exception("Список пуст");
            double result = myList.Average();
            return result;
        }
        /// <summary>
        /// Метод для сравнения средних значений списков
        /// </summary>
        /// <param name="list1">Список 1</param>
        /// <param name="list2">Список 2</param>
        public static string CompareLists(List<int> list1, List<int> list2)
        {
            if (ListAverage(list1) > ListAverage(list2))
                return "Среднее значение списка 1 больше списка 2";


            if (ListAverage(list2) > ListAverage(list1))
                return "Среднее значение списка 2 больше списка 1";


            else
                return "Средние значения списокв равны";

        }
    }
}
