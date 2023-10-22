using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace TestProject1
{
    public class UI
    {
        public static List<int> CreateList()
        {
            Console.Write("Введите целые числа для заполнения списка через пробел:");
            string userInput = Console.ReadLine();
            List<int> list = new List<int>();
            string[] myStrings = userInput.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
            foreach (string s in myStrings)
            {
                int temp;
                if (!int.TryParse(s, out temp))
                    throw new ArgumentException("Вы ввели не число!");
                else
                    list.Add(temp);
            }
            Console.WriteLine("Список создан");
            return list;
        }
    }
}

