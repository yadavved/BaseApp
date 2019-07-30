package app.dev.baseapp.Test;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class A extends B implements iC, iD  {
    private  Context context;

    public static  String TAG = "A";

    public A(Context context){
        this.context = context;
    }

    @Override
    public void hello() {
        Log.d(TAG, "Hello From iC");
        Toast.makeText(context, "Hello From iC", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void helloFromB() {
        Log.d(TAG, "Hello From B");
        Toast.makeText(context, "Hello From B", Toast.LENGTH_SHORT).show();

    }
}

