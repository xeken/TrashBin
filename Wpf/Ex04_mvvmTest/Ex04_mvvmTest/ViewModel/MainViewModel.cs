using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Input;

namespace Ex04_mvvmTest.ViewModel
{
    public class MainViewModel : INotifyPropertyChangedImpl
    {
        public MainViewModel()
        {
            PageNumber = 1;
        }

        private int pageNumber;
        public int PageNumber
        {
            get => pageNumber;
            set
            {
                int temp = this.pageNumber;

                pageNumber = value;
                OnPropertyChanged("PageNumber");

                if(0 < pageNumber && pageNumber < 11)
                {
                    OnPropertyChanged("IsMinusEnable");
                    OnPropertyChanged("IsPlusEnable");
                    PageContent = "This page is " + PageNumber;
                }
                else
                {
                    MessageBox.Show("over range 1~10 ");
                    PageNumber = temp;
                    //OnPropertyChanged("PageNumber");
                }
            }
        }
        
        private String pageContent;
        public String  PageContent
        {
            get => this.pageContent;
            set
            {
                this.pageContent = value;
                OnPropertyChanged("PageContent");
            }
        }
        
        private ICommand commandMinus;
        private ICommand commandPlus;
        public ICommand CommandMinus
        {
            get => this.commandMinus ?? (this.commandMinus = new DelegateCommand(Minus));
        }
        public ICommand CommandPlus
        {
            get => this.commandPlus ?? (this.commandPlus = new DelegateCommand(Plus));
        }
        private void Minus() => PageNumber--;
        private void Plus() => PageNumber++;

        public bool IsMinusEnable
        {
            get => PageNumber > 1 ? true : false ;
        }
        public bool IsPlusEnable
        {
            get => PageNumber < 10 ? true : false;
        }
    }

    #region DelegateCommand Class
    public class DelegateCommand : ICommand
    {
        private readonly Func<bool> canExecute;
        private readonly Action execute;

        public DelegateCommand(Action execute) : this(execute, null)
        {
        }

        public DelegateCommand(Action execute, Func<bool> canExecute)
        {
            this.execute = execute;
            this.canExecute = canExecute;
        }
        public event EventHandler CanExecuteChanged;

        public bool CanExecute(object o)
        {
            if (this.canExecute == null)
                return true;
            return this.canExecute();
        }
        public void Execute(object o) => this.execute();

        public void RaiseCanExecuteChanged()
        {
            if (this.CanExecuteChanged != null)
                this.CanExecuteChanged(this, EventArgs.Empty);
        }
    }
    #endregion

}
