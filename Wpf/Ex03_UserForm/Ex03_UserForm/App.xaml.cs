using Ex03_UserForm.ViewModel;
using System.Windows;

namespace Ex03_UserForm
{
    /// <summary>
    /// App.xaml에 대한 상호 작용 논리
    /// </summary>
    public partial class App : Application
    {
        protected override void OnStartup(StartupEventArgs e)
        {
            base.OnStartup(e);
            MainWindow window = new MainWindow();
            MainWindowViewModel vm = new MainWindowViewModel();
            window.DataContext = vm;
            window.Show();
        }
    }
}
