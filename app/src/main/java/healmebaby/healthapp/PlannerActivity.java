package healmebaby.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import static healmebaby.healthapp.R.styleable.Spinner;

public class PlannerActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "healmebaby.healthapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);
    }

    public void save_Plan(View view) {
        //Do something in response to button
        EditText editPlan = (EditText) findViewById(R.id.edit_plan);
        String message = editPlan.getText().toString();
    }

}
