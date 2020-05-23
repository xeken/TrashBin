using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace exicon_DataExchange
{
    public class ICommandImpl : ICommand
    {
        Action<object> _executeMethod;
        Func<object, bool> _canexecuteMethod;

        public ICommandImpl(Action<object> executeMethod, Func<object, bool> canexecuteMethod)
        {
            this._executeMethod = executeMethod;
            this._canexecuteMethod = canexecuteMethod;
        }

        public event EventHandler CanExecuteChanged;

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            _executeMethod(parameter);
        }
        private bool CanExecuteMethod(object arg)
        {
            return true;
        }
    }
}
