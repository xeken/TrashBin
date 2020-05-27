namespace exicon_DataExchange
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.lstLeft = new System.Windows.Forms.ListBox();
            this.btnLst1Header = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.pnlRight = new System.Windows.Forms.Panel();
            this.btnLst2Header = new System.Windows.Forms.Button();
            this.lstRight = new System.Windows.Forms.ListBox();
            this.btnMoveToRight = new System.Windows.Forms.Button();
            this.btnMoveToLeft = new System.Windows.Forms.Button();
            this.pnlLogText = new System.Windows.Forms.Panel();
            this.lblLogText = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.pnlRight.SuspendLayout();
            this.pnlLogText.SuspendLayout();
            this.SuspendLayout();
            // 
            // lstLeft
            // 
            this.lstLeft.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left)));
            this.lstLeft.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.lstLeft.DrawMode = System.Windows.Forms.DrawMode.OwnerDrawFixed;
            this.lstLeft.Font = new System.Drawing.Font("굴림", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lstLeft.FormattingEnabled = true;
            this.lstLeft.ItemHeight = 23;
            this.lstLeft.Location = new System.Drawing.Point(1, 25);
            this.lstLeft.Margin = new System.Windows.Forms.Padding(0);
            this.lstLeft.Name = "lstLeft";
            this.lstLeft.SelectionMode = System.Windows.Forms.SelectionMode.MultiSimple;
            this.lstLeft.Size = new System.Drawing.Size(198, 138);
            this.lstLeft.TabIndex = 0;
            this.lstLeft.DrawItem += new System.Windows.Forms.DrawItemEventHandler(this.lstLeft_Paint);
            // 
            // btnLst1Header
            // 
            this.btnLst1Header.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.btnLst1Header.BackColor = System.Drawing.Color.Silver;
            this.btnLst1Header.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(68)))), ((int)(((byte)(144)))), ((int)(((byte)(196)))));
            this.btnLst1Header.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(68)))), ((int)(((byte)(144)))), ((int)(((byte)(196)))));
            this.btnLst1Header.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(68)))), ((int)(((byte)(144)))), ((int)(((byte)(196)))));
            this.btnLst1Header.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLst1Header.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnLst1Header.ForeColor = System.Drawing.Color.White;
            this.btnLst1Header.Location = new System.Drawing.Point(1, 1);
            this.btnLst1Header.Margin = new System.Windows.Forms.Padding(0);
            this.btnLst1Header.Name = "btnLst1Header";
            this.btnLst1Header.Size = new System.Drawing.Size(198, 25);
            this.btnLst1Header.TabIndex = 4;
            this.btnLst1Header.Text = "ListBox1: Header";
            this.btnLst1Header.UseVisualStyleBackColor = false;
            this.btnLst1Header.Click += new System.EventHandler(this.btnLst1Header_Click);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.btnLst1Header);
            this.panel1.Controls.Add(this.lstLeft);
            this.panel1.Location = new System.Drawing.Point(12, 12);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(200, 165);
            this.panel1.TabIndex = 2;
            this.panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.pnl_Paint);
            // 
            // pnlRight
            // 
            this.pnlRight.Controls.Add(this.btnLst2Header);
            this.pnlRight.Controls.Add(this.lstRight);
            this.pnlRight.Location = new System.Drawing.Point(286, 13);
            this.pnlRight.Name = "pnlRight";
            this.pnlRight.Size = new System.Drawing.Size(200, 165);
            this.pnlRight.TabIndex = 3;
            this.pnlRight.Paint += new System.Windows.Forms.PaintEventHandler(this.pnl_Paint);
            // 
            // btnLst2Header
            // 
            this.btnLst2Header.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.btnLst2Header.BackColor = System.Drawing.Color.Silver;
            this.btnLst2Header.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(68)))), ((int)(((byte)(144)))), ((int)(((byte)(196)))));
            this.btnLst2Header.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(68)))), ((int)(((byte)(144)))), ((int)(((byte)(196)))));
            this.btnLst2Header.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(68)))), ((int)(((byte)(144)))), ((int)(((byte)(196)))));
            this.btnLst2Header.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLst2Header.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btnLst2Header.ForeColor = System.Drawing.Color.White;
            this.btnLst2Header.Location = new System.Drawing.Point(1, 1);
            this.btnLst2Header.Margin = new System.Windows.Forms.Padding(0);
            this.btnLst2Header.Name = "btnLst2Header";
            this.btnLst2Header.Size = new System.Drawing.Size(198, 25);
            this.btnLst2Header.TabIndex = 5;
            this.btnLst2Header.Text = "ListBox2: Header";
            this.btnLst2Header.UseVisualStyleBackColor = false;
            this.btnLst2Header.Click += new System.EventHandler(this.btnLst2Header_Click);
            // 
            // lstRight
            // 
            this.lstRight.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.lstRight.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.lstRight.DrawMode = System.Windows.Forms.DrawMode.OwnerDrawFixed;
            this.lstRight.Font = new System.Drawing.Font("굴림", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lstRight.FormattingEnabled = true;
            this.lstRight.ItemHeight = 23;
            this.lstRight.Location = new System.Drawing.Point(1, 25);
            this.lstRight.Margin = new System.Windows.Forms.Padding(0);
            this.lstRight.Name = "lstRight";
            this.lstRight.SelectionMode = System.Windows.Forms.SelectionMode.MultiSimple;
            this.lstRight.Size = new System.Drawing.Size(198, 138);
            this.lstRight.TabIndex = 1;
            this.lstRight.DrawItem += new System.Windows.Forms.DrawItemEventHandler(this.lstRight_Paint);
            // 
            // btnMoveToRight
            // 
            this.btnMoveToRight.Location = new System.Drawing.Point(223, 32);
            this.btnMoveToRight.Name = "btnMoveToRight";
            this.btnMoveToRight.Size = new System.Drawing.Size(51, 27);
            this.btnMoveToRight.TabIndex = 5;
            this.btnMoveToRight.Text = "→";
            this.btnMoveToRight.UseVisualStyleBackColor = true;
            this.btnMoveToRight.Click += new System.EventHandler(this.btnMoveToRight_Click);
            // 
            // btnMoveToLeft
            // 
            this.btnMoveToLeft.Location = new System.Drawing.Point(223, 68);
            this.btnMoveToLeft.Name = "btnMoveToLeft";
            this.btnMoveToLeft.Size = new System.Drawing.Size(51, 27);
            this.btnMoveToLeft.TabIndex = 6;
            this.btnMoveToLeft.Text = "←";
            this.btnMoveToLeft.UseVisualStyleBackColor = true;
            this.btnMoveToLeft.Click += new System.EventHandler(this.btnMoveToLeft_Click);
            // 
            // pnlLogText
            // 
            this.pnlLogText.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.pnlLogText.Controls.Add(this.lblLogText);
            this.pnlLogText.Location = new System.Drawing.Point(12, 193);
            this.pnlLogText.Name = "pnlLogText";
            this.pnlLogText.Size = new System.Drawing.Size(473, 90);
            this.pnlLogText.TabIndex = 7;
            // 
            // lblLogText
            // 
            this.lblLogText.AutoSize = true;
            this.lblLogText.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lblLogText.Location = new System.Drawing.Point(0, 0);
            this.lblLogText.Margin = new System.Windows.Forms.Padding(0);
            this.lblLogText.Name = "lblLogText";
            this.lblLogText.Size = new System.Drawing.Size(0, 16);
            this.lblLogText.TabIndex = 0;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(503, 302);
            this.Controls.Add(this.pnlLogText);
            this.Controls.Add(this.btnMoveToLeft);
            this.Controls.Add(this.btnMoveToRight);
            this.Controls.Add(this.pnlRight);
            this.Controls.Add(this.panel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "Form1";
            this.Text = "Form1";
            this.panel1.ResumeLayout(false);
            this.pnlRight.ResumeLayout(false);
            this.pnlLogText.ResumeLayout(false);
            this.pnlLogText.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.ListBox lstLeft;
        private System.Windows.Forms.Button btnLst1Header;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel pnlRight;
        private System.Windows.Forms.Button btnLst2Header;
        private System.Windows.Forms.ListBox lstRight;
        private System.Windows.Forms.Button btnMoveToRight;
        private System.Windows.Forms.Button btnMoveToLeft;
        private System.Windows.Forms.Panel pnlLogText;
        private System.Windows.Forms.Label lblLogText;
    }
}

