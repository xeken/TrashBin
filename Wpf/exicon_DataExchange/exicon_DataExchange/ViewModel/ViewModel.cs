using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace exicon_DataExchange.ViewModel
{
    public class ViewModel : INotifyPropertyChangedImpl
    {
        public ICommand MoveToRightCommand { get; set; }
        public ICommand MoveToLeftCommand { get; set; }
        private bool CanExecuteMethod(object arg) => true;
        private void MoveToRight(object obj)
        {
            logText += "QQQQQ\n";
        }
        private void MoveToLeft(object obj)
        {
            LogText += "EEEEEE\n";
        }
        public static List<String> abc;

        private List<String> wordList1;
        public List<String> WordList1
        {
            get => this.wordList1;
            set
            {
                this.wordList1 = value;
                OnPropertyChanged("WordList1");
            }
        }

        private List<String> wordList2;
        public List<String> WordList2
        {
            get => this.wordList2;
            set
            {
                this.wordList2 = value;
                OnPropertyChanged("WordList2");
            }
        }

        private String logText;
        public String LogText
        {
            get => this.logText;
            set
            {
                this.logText = value;
                OnPropertyChanged("LogText");
            }
        }

        public ViewModel()
        {
            WordList1 = new List<string>();
            WordList1.Add("Hello");
            WordList1.Add("World");
            WordList1.Add("Fox");
            WordList1.Add("Jumps over");
            WordList1.Add("Rabbit");

            WordList2 = new List<string>();
            WordList2.Add("Howdy");
            WordList2.Add("Hero");

            MoveToRightCommand = new ICommandImpl(MoveToRight, CanExecuteMethod);
            MoveToLeftCommand = new ICommandImpl(MoveToLeft, CanExecuteMethod);
        }
    }

}
