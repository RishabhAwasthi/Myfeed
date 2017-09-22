package com.example.awasthis.myfeed;

/**
 * Created by awasthi's on 9/22/2017.
 */

public class ListItem {
    public String txtTitle;
    public String txtContent;
   /* public int pro_imag;
    public String txtPubDate;
    public String name;
    public String readmore;*/

    public ListItem(String txtTitle, String txtContent) {
        this.txtTitle = txtTitle;
        this.txtContent = txtContent;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public void setTxtContent(String txtContent) {
        this.txtContent = txtContent;
    }


    public String getTxtTitle() {
        return txtTitle;
    }

    public String getTxtContent() {
        return txtContent;
    }
}
