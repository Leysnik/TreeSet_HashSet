package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button send,show;
    TextView tree,hash;
    TreeSet<String> treeSet = new TreeSet<>();
    HashSet<String> hashSet = new HashSet<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.edit);
        send = findViewById(R.id.btn);
        show = findViewById(R.id.sub_btn);
        tree = findViewById(R.id.tree);
        hash = findViewById(R.id.hash);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = edit.getText().toString();
                treeSet.add(tmp);
                hashSet.add(tmp);
                edit.setText("");
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tree.setText("TreeSet\n");
                for(String i:treeSet){
                    String tmp = i+"\n";
                    tree.append(tmp);
                }
                hash.setText("HashSet\n");
                for(String i:hashSet){
                    String tmp = i+"\n";
                    hash.append(tmp);
                }
            }
        });
    }
}