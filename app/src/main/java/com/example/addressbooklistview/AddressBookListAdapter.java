package com.example.addressbooklistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class AddressBookListAdapter extends BaseAdapter {
    private List<Contact> contactList;

    public AddressBookListAdapter(List<Contact> contactList)
    {
        this.contactList = contactList;
    }

    public class ListViewHolder{
        private TextView tvid,tvname,tvphone,tvemail;
        public ListViewHolder(View view)
        {
            tvid = view.findViewById(R.id.tv_id);
            tvname = view.findViewById(R.id.tv_name);
            tvphone = view.findViewById(R.id.tv_ph);
            tvemail = view.findViewById(R.id.tv_email);
        }
    }
    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
