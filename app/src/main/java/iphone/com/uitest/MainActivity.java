package iphone.com.uitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long Id) {

                Fruit fruit = fruitList.get(position);
//                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                    Intent intent = new Intent(MainActivity.this, UITwo.class);
                    startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,UIThird.class);
                        startActivity(intent1);
                        break;
                    default:
                        break;

                }
            }



        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initFruits(){
        Fruit apple = new Fruit("Apple",R.drawable.apple_pic,1);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana",R.drawable.banana_pic,2);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange",R.drawable.orange_pic,3);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon_pic,4);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("pear",R.drawable.pear_pic,5);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape",R.drawable.grape_pic,6);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple",R.drawable.pineapple_pic,7);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry",R.drawable.strawberry_pic,8);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry",R.drawable.cherry_pic,9);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango",R.drawable.mango_pic,10);
        fruitList.add(mango);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
