package com.kuldeep.zookaresult;

import android.app.Dialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

import com.kuldeep.zookaresult.Child_Tab_Jobs.All_Jobs;


public class InternetDialog {
    private Context context;

    public InternetDialog(All_Jobs home){

    }
    public InternetDialog(Context context){
        this.context = context;
    }

    public void showNoInternetDialog(){
        final Dialog dialog1 = new Dialog(context, R.style.Theme_AppCompat_NoActionBar);
        dialog1.setContentView(R.layout.custom_internet);
        dialog1.setCancelable(false);
        dialog1.show();
    }
    public  boolean getInternetStatus() {

        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();

        if(!isConnected) {
            //show no internet dialog
            showNoInternetDialog();
        }
        return isConnected;
    }
}
