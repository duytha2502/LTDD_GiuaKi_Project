package com.example.ltdd_giuaki_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class LapTopAdapter  extends BaseAdapter {

    private List<LapTop> lapTopList;
    private int layout;
    private Context context;

    public LapTopAdapter(Context Context,int layout,  List<LapTop> latoplist) {
        this.context = Context;
        this.layout = layout;
        this.lapTopList=latoplist;
    }

    @Override
    public int getCount() {
        return lapTopList.size();
    }

    @Override
    public Object getItem(int i){
        return lapTopList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder{
        ImageView imagelapTop;
        TextView txtName,txtgiaCu,txtgiaKM;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) view.findViewById(R.id.textView_laptopName);
            holder.txtgiaCu = (TextView) view.findViewById(R.id.textView_giacu);
            holder.txtgiaKM = (TextView) view.findViewById(R.id.textView_giakm);
            holder.imagelapTop = (ImageView) view.findViewById(R.id.imageView_laptop);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        LapTop lapTop = lapTopList.get(i);

        holder.txtName.setText(lapTop.getLaptopName());
        holder.txtgiaCu.setText(lapTop.getGiaCu());
        holder.txtgiaKM.setText(lapTop.getGiaKM());
        holder.imagelapTop.setImageResource(lapTop.getLaptop());

        return view;
    }
}
