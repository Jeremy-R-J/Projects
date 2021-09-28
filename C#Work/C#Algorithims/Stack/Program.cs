﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stack
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack theStack = new Stack(4);
            theStack.push("Star Wars");
            theStack.push("The Shining");
            theStack.push("Goodfellas");
            theStack.push("Godfather");

            WriteLine("==========\nThe Stack contains:\n")
            while (!theStack.isEmpty())
            {
                string movie = theStack.pop();
                WriteLine(movie);
            }
        }
    }
        public class stack
        {
            private int maxSize;
            private string[] stackArray;
            private int top;
            
        public stack (int size)
	    {
                maxSize = size;
                stackArray = new string[maxSize];
                top = -1;

	    }
        public void push(string m)
                if(isFull())
                {
                    WriteLine("This stack is full");
                }
                else
                    {
                    top++;
                    stackArray[top]=m;
                    }
        public string pop()
            if(isEmpty())
                {
                    WriteLine("This stack is empty");
                    return"--";
                }
            else{
                    int old_top = top;
                    top--;
                    return stackArray[old_top];
                }

        public bool isFull()
        {
        return (maxSize -1 == top);
        }

        public bool isEmpty()
        {
        return (top == -1);
        }

    }
}
