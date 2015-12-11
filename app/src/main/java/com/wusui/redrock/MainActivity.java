package com.wusui.redrock;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by fg on 2015/12/11.
 */
public class MainActivity extends AppCompatActivity {
    private List<Student>studentList = new ArrayList<Student>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudent();
        StudentAdapter adapter = new StudentAdapter(MainActivity.this,R.layout.list_item,studentList);
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

            }


    private void  initStudent(){
        Student Bernoulli =new Student("Bernoulli,1700-1782",R.drawable.ic2);
        studentList.add( Bernoulli );
        Student Pythagoras  =new Student("Pythagoras，580？-500？ ",R.drawable.ic3);
        studentList.add( Pythagoras);
        Student  Lagrange  =new Student(" Lagrange，1736-1813",R.drawable.ic40);
        studentList.add(  Lagrange);
        Student Galile  =new Student("Galile，1564-1642 ",R.drawable.ic5);
        studentList.add( Galile );
        Student Fibonacci  =new Student("Fibonacci，？？ ",R.drawable.ic6);
        studentList.add( Fibonacci);
        Student Fermat  =new Student("Fermat，1601-1665",R.drawable.ic7);
        studentList.add(Fermat);
        Student Cauchy  =new Student("Cauchy，神一样的男人",R.drawable.ic8);
        studentList.add( Cauchy);

    }
}
