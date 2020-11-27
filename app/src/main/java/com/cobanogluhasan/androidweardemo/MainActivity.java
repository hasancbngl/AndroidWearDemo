package com.cobanogluhasan.androidweardemo;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private static final String TAG = "MainActivity";
    Button button;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final String[]  list = {"hasan","glow","rick","dres","hles"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, list[position], Toast.LENGTH_SHORT).show();
            }
        });
        /*
        mTextView = (TextView) findViewById(R.id.text);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getResources().getConfiguration().isScreenRound()) {
                    Toast.makeText(MainActivity.this, "it's round screen", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "İt's square screen", Toast.LENGTH_SHORT).show();
                }

            }
        });

*/

        // Enables Always-on
        setAmbientEnabled();
    }


}
