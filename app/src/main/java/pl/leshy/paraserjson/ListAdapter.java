package pl.leshy.paraserjson;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sowa on 31.01.2017.
 */

public class ListAdapter extends ArrayAdapter<Product> {

    ArrayList<Product> products;
    Context context;
    int resource;

    public ListAdapter(Context context, int resource, ArrayList<Product> products) {
        super(context, resource, products);
        this.products = products;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_layout, null, true);

        }
        Product product = getItem(position);

        TextView txtNazwa = (TextView) convertView.findViewById(R.id.txtNazwa);
        txtNazwa.setText(product.getNazwa());

        TextView txtNetto = (TextView) convertView.findViewById(R.id.txNetto);
        txtNetto.setText(product.getNetto());

        TextView txtBrutto = (TextView) convertView.findViewById(R.id.txtBrutto);
        txtBrutto.setText(product.getBrutto());

        TextView txtEAN = (TextView) convertView.findViewById(R.id.txtEAN);
        txtEAN.setText(product.getEAN());


        return convertView;
    }


}