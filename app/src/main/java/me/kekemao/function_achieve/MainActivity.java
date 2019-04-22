package me.kekemao.function_achieve;

import android.os.Bundle;
import android.view.View;

import me.kekemao.function_achieve.base.BaseActivity;
import me.kekemao.function_achieve.utils.L;

public class MainActivity extends BaseActivity {
    @Override
    public void widgetClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setSteepStatusBar(true);

    }

    @Override
    public void initParms(Bundle parms) {

    }

    @Override
    public View bindView() {
//        View view = getWindow().getDecorView();
        return null;
    }

    @Override
    public int bindLayout() {
        int id = R.layout.activity_main;
        L.i("id:" + id);
        return id;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void setListener() {

    }

    @Override
    public void doBusiness(BaseActivity mContext) {

    }
}
