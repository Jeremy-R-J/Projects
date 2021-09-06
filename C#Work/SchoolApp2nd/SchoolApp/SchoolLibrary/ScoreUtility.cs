using System;
using System.Collections.Generic;
using System.Text;

namespace SchoolLibrary
{
    public class ScoreUtility
    {
        public static iScored BestOfTwo(iScored Assignment1, iScored Assigntment2)
        {
            var score1 = Assignment1.Score / Assignment1.MaximumScore;
            var score2 = Assigntment2.Score / Assigntment2.MaximumScore;

            if(score1>score2)
            {
                return Assignment1;
            }else
            {
                return Assigntment2;
            }
        }
    }
}
