package com.chen.chat.clist;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chen.chat.clist.msg.CMessage;

import java.util.List;

public abstract class AbsBinderHolder extends RecyclerView.ViewHolder {
    public AbsBinderHolder(@NonNull View itemView) {
        super(itemView);
    }
    public abstract void bind(List<? extends CMessage> chatList, int position);
}
