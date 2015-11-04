package com.yeqf.app.viewdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.yeqf.app.viewdemo.activity.AtyUsingAutoCompleteTextView;
import com.yeqf.app.viewdemo.activity.AtyUsingBaseAdapter;
import com.yeqf.app.viewdemo.activity.AtyUsingCheckBox;
import com.yeqf.app.viewdemo.activity.AtyUsingColorRes;
import com.yeqf.app.viewdemo.activity.AtyUsingDatePicker;
import com.yeqf.app.viewdemo.activity.AtyUsingGallery;
import com.yeqf.app.viewdemo.activity.AtyUsingGridView;
import com.yeqf.app.viewdemo.activity.AtyUsingImageSwitcher;
import com.yeqf.app.viewdemo.activity.AtyUsingNotification;
import com.yeqf.app.viewdemo.activity.AtyUsingProgressBar;
import com.yeqf.app.viewdemo.activity.AtyUsingProgressDialog;
import com.yeqf.app.viewdemo.activity.AtyUsingRadioGroup;
import com.yeqf.app.viewdemo.activity.AtyUsingRatingBar;
import com.yeqf.app.viewdemo.activity.AtyUsingScrollView;
import com.yeqf.app.viewdemo.activity.AtyUsingSeekBar;
import com.yeqf.app.viewdemo.activity.AtyUsingSpinner;
import com.yeqf.app.viewdemo.activity.AtyUsingTimePicker;
import com.yeqf.app.viewdemo.adaptor.ListCellData;

public class MainActivity extends ListActivity {

    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        adapter.add(new ListCellData(this, "RadioGroup", new Intent(this, AtyUsingRadioGroup.class)));
        adapter.add(new ListCellData(this, "CheckBox", new Intent(this, AtyUsingCheckBox.class)));
        adapter.add(new ListCellData(this, "DatePicker", new Intent(this, AtyUsingDatePicker.class)));
        adapter.add(new ListCellData(this, "TimePicker", new Intent(this, AtyUsingTimePicker.class)));
        adapter.add(new ListCellData(this, "Spinner", new Intent(this, AtyUsingSpinner.class)));
        adapter.add(new ListCellData(this, "ProgressBar", new Intent(this, AtyUsingProgressBar.class)));
        adapter.add(new ListCellData(this, "SeekBar", new Intent(this, AtyUsingSeekBar.class)));
        adapter.add(new ListCellData(this, "GridView", new Intent(this, AtyUsingGridView.class)));
        adapter.add(new ListCellData(this, "ProgressDialog", new Intent(this, AtyUsingProgressDialog.class)));
        adapter.add(new ListCellData(this, "Notification", new Intent(this, AtyUsingNotification.class)));
        adapter.add(new ListCellData(this, "ScrollView", new Intent(this, AtyUsingScrollView.class)));
        adapter.add(new ListCellData(this, "RatingBar", new Intent(this, AtyUsingRatingBar.class)));
        adapter.add(new ListCellData(this, "ImageSwitcher", new Intent(this, AtyUsingImageSwitcher.class)));
        adapter.add(new ListCellData(this, "Gallery", new Intent(this, AtyUsingGallery.class)));
        adapter.add(new ListCellData(this, "BaseAdapter", new Intent(this, AtyUsingBaseAdapter.class)));
        adapter.add(new ListCellData(this, "AutoCompleteTextView", new Intent(this, AtyUsingAutoCompleteTextView.class)));
        adapter.add(new ListCellData(this, "ColorRes", new Intent(this, AtyUsingColorRes.class)));
    }

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        ListCellData data = adapter.getItem(position);
        data.startActivity();
        super.onListItemClick(listView, view, position, id);
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
        if (id == R.id.view) {
            Toast.makeText(MainActivity.this, "This is a view", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
