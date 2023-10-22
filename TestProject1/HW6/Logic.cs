using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestProject1
{
    public class Logic
    {
        private UI _userInput;
        private Average _averageList;

        public Logic(UI userInput, Average averageList)
        {
            _userInput = userInput;
            _averageList = averageList;
        }

        public Logic () { }


        public void Run()
        {
            List<int> list1 = UI.CreateList();
            List<int> list2 = UI.CreateList();
            Average average = new Average(list1, list2);

            Console.WriteLine("Среднее значение списка 1 = " + Average.ListAverage(list1));
            Console.WriteLine("Среднее значение списка 1 = " + Average.ListAverage(list2));

            Console.WriteLine(Average.CompareLists(list1, list2));
            Console.WriteLine(Average.CompareLists(list1, list2));
        }
    }
}
