using System;

public class Program
{
    /*
     *백준 4344번
     *문제 : 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
     *입력: 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
     *      둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
     *출력: 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
     */
    public static void Main()
    {
        ///GET DATA//////////////////////////////////////
        int count = int.Parse(Console.ReadLine());
        int[][] score = new int[count][];

        string input;
        string[] cell;

        for (int i = 0; i < count; i++)
        {

            input = Console.ReadLine();
            cell = input.Split();

            score[i] = new int[int.Parse(cell[0])];

            for (int j = 0; j < int.Parse(cell[0]); j++)
                score[i][j] = int.Parse(cell[j + 1]);
        }
        /////CALCULATE//////////////////////////////////////
        int average = 0;
        int check = 0;

        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < score[i].Length; j++)
                average += score[i][j];

            average /= score[i].Length;

            for (int j = 0; j < score[i].Length; j++)
                if (average < score[i][j])
                    ++check;

            Console.WriteLine(string.Format("{0:0.000}", Math.Round(((double)check / score[i].Length * 100), 3)) + "%");

            average = 0;
            check = 0;
        }
    }
}

