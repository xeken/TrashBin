using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace currency_mvvm2.ViewModel.Command
{
    class ManageCommad : ICommand
    {
        public event EventHandler CanExecuteChanged;
        private Action _execute;

        public ManageCommad(Action execute)
        {
            this._execute = execute;
        }

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            _execute.Invoke();
        }
    }
}
