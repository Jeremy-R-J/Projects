using System;
using System.Collections.Generic;
using System.Text;

namespace SchoolLibrary
{
    public static class ExtensionMethods
    {
        public static int WordCount(this  string str)
        {
            var WordCount= str.Split(new char[] {' ','.','?' }, StringSplitOptions.RemoveEmptyEntries).Length;
            return WordCount;
        }
    }
}
