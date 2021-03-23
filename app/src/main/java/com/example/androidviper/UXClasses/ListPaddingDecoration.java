package com.example.androidviper.UXClasses;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Allan Nava on 23/03/2021.
 * Updated by Allan Nava on 23/03/2021.
 */

public class ListPaddingDecoration extends RecyclerView.ItemDecoration {
    public int mPaddingTop;
    public int mPaddingBottom;

    public static final int paddingTopSpace = 172;
    public ListPaddingDecoration(@NonNull Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        mPaddingTop = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, paddingTopSpace, metrics);
        mPaddingBottom = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 80, metrics);

    }
    public ListPaddingDecoration(@NonNull Context context, int top, int bottom) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        mPaddingTop = top;
        mPaddingBottom = bottom;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        final int itemPosition = parent.getChildAdapterPosition(view);
        if (itemPosition == RecyclerView.NO_POSITION) {
            return;
        }
        if (itemPosition == 0) {
            outRect.top = mPaddingTop;
        }

        final RecyclerView.Adapter adapter = parent.getAdapter();
        if ((adapter != null) && (itemPosition == adapter.getItemCount() - 1)) {
            outRect.bottom = mPaddingBottom;
        }
    }

}
