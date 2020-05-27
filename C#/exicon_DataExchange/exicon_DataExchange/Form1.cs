using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace exicon_DataExchange
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            InitWidgets();
            this.MaximizeBox = false;
        }

        #region Graphics
        public void InitWidgets()
        {
            this.pnlLogText.AutoScroll = true;
            this.btnLst1Header.BackColor = Color.FromArgb(255,68,144,196); 
            this.btnLst2Header.BackColor = Color.FromArgb(255,68,144,196);

            this.lstLeft.Items.Add("Hello");
            this.lstLeft.Items.Add("World");
            this.lstLeft.Items.Add("Fox");
            this.lstLeft.Items.Add("Jumps over");
            this.lstLeft.Items.Add("Rabbit");

            this.lstRight.Items.Add("Howdy");
            this.lstRight.Items.Add("Hero");
        }
        private void pnl_Paint(object sender, PaintEventArgs e)
        {
            base.OnPaint(e);
            int borderWidth = 1;
            Color borderColor = Color.FromArgb(255, 68, 144, 196);

            ControlPaint.DrawBorder(e.Graphics, e.ClipRectangle, borderColor, borderWidth, ButtonBorderStyle.Solid, borderColor, borderWidth, ButtonBorderStyle.Solid, borderColor, borderWidth, ButtonBorderStyle.Solid, borderColor, borderWidth, ButtonBorderStyle.Solid);
        }
        private void lstLeft_Paint(object sender, DrawItemEventArgs e)
        {
            if (e.Index < 0) return;
            if ((e.State & DrawItemState.Selected) == DrawItemState.Selected)
                e = new DrawItemEventArgs(e.Graphics, e.Font, e.Bounds, e.Index, e.State ^ DrawItemState.Selected, e.ForeColor, Color.FromArgb(168, 255, 217, 102));
            e.DrawBackground();
            try
            {
                e.Graphics.DrawString((lstLeft.Items)[e.Index].ToString(), e.Font, Brushes.Black, e.Bounds, StringFormat.GenericDefault);
            }
            catch (Exception) { }
            e.DrawFocusRectangle();
        }
        private void lstRight_Paint(object sender, DrawItemEventArgs e)
        {
            if (e.Index < 0) return;
            if ((e.State & DrawItemState.Selected) == DrawItemState.Selected)
                e = new DrawItemEventArgs(e.Graphics, e.Font, e.Bounds, e.Index, e.State ^ DrawItemState.Selected, e.ForeColor, Color.FromArgb(168, 255, 217, 102));
            e.DrawBackground();
            try
            {
                e.Graphics.DrawString((lstRight.Items)[e.Index].ToString(), e.Font, Brushes.Black, e.Bounds, StringFormat.GenericDefault);
            }
            catch (Exception) { }
            e.DrawFocusRectangle();
        }
        #endregion

        private void btnMoveToRight_Click(object sender, EventArgs e)
        {
            while (this.lstLeft.SelectedItems.Count > 0)
            {
                string item = (string)lstLeft.SelectedItems[0];
                this.lstLeft.Items.Remove(item);
                this.lstRight.Items.Add(item);
                this.lblLogText.Text += "Item: " + item + " moved from ListBox1 to ListBox2\n";
            }
        }

        private void btnMoveToLeft_Click(object sender, EventArgs e)
        {
            while (this.lstRight.SelectedItems.Count > 0)
            {
                string item = (string)lstRight.SelectedItems[0];
                this.lstRight.Items.Remove(item);
                this.lstLeft.Items.Add(item);
                this.lblLogText.Text += "Item: " + item + " moved from ListBox2 to ListBox1\n";
            }
        }

        private void btnLst1Header_Click(object sender, EventArgs e)
        {
            this.lstLeft.Sorted = true;
            this.lstLeft.Sorted = false;
        }

        private void btnLst2Header_Click(object sender, EventArgs e)
        {
            this.lstRight.Sorted = true;
            this.lstRight.Sorted = false;
        }
    }
}
