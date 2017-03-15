package pl.leshy.paraserjson;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;



public class Search extends Activity {

    ListView lv;
    SearchView sv;

    public pl.leshy.paraserjson.Product nazwa;
    public pl.leshy.paraserjson.Product EAN;


    pl.leshy.paraserjson.Product[] Product={nazwa, EAN};
    ArrayAdapter<Product > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView) findViewById(R.id.listView);
        sv=(SearchView) findViewById(R.id.search_bar);

        adapter=new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1,Product);
        lv.setAdapter(adapter);

        sv.setOnQueryTextListener(new OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String text) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {

                adapter.getFilter().filter(text);

                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}