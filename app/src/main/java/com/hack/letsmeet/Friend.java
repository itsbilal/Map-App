package com.hack.letsmeet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Colin on 2014-09-21.
 */
public class Friend



{
    public String id;
    public String name;

    public Friend(String  id, String name){

        this.id = id;
        this.name
               = name;

    }



}

public class FriendsListAdapter extends ArrayAdapter<Friend> {

    public FriendsListAdapter(Context context, int resource, List<Friend> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}