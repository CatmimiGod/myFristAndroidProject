package adapter;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.catmi.myfristandroidproject.MainActivity;

/**
 * Created by catmi on 2017/8/2.
 */

public class PicAdapter extends PagerAdapter
{

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    // 初始化显示的条目对象
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // return super.instantiateItem(container, position);
        // 准备显示的数据，一个简单的TextView
        TextView tv = new TextView(container.getContext());
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        tv.setText("我是天才" + position + "号");
        switch (position) {
            case 0:
                tv.setBackgroundColor(Color.GREEN);
                tv.getBackground().setAlpha(100);
                break;
            case 1:
                tv.setBackgroundColor(Color.RED);
                tv.getBackground().setAlpha(100);
                break;
            case 2:
                tv.setBackgroundColor(Color.YELLOW);
                tv.getBackground().setAlpha(100);
                break;
            case 3:
                tv.setBackgroundColor(Color.BLUE);
                tv.getBackground().setAlpha(100);
                break;
            case 4:
                tv.setBackgroundColor(Color.CYAN);
                tv.getBackground().setAlpha(100);
                break;

        }

        // 添加到ViewPager容器
        container.addView(tv);

        // 返回填充的View对象
        return tv;
    }


    // 销毁条目对象
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
}
