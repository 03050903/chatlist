package com.chen.chat.clist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chen.chat.clist.msg.CMessage;

import java.util.List;

/**
 * 列表展示的
 */
public abstract class AbsChatListAdapter extends RecyclerView.Adapter<AbsBinderHolder> {
    /**
     * 保存所有聊天记录
     */
    private List<? extends CMessage> mChatList;
    private LayoutInflater mLayoutInflater;
    public AbsChatListAdapter(Context context,List<? extends CMessage> chatList){
        mLayoutInflater=LayoutInflater.from(context);
        this.mChatList=chatList;
    }

    @NonNull
    @Override
    public AbsBinderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layoutId = getLayoutId(viewType);
        View view=mLayoutInflater.inflate(layoutId,parent,false);
        return createHolder(view,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull AbsBinderHolder holder, int position) {
        holder.bind(mChatList,position);
    }

    @Override
    public int getItemCount() {
        return mChatList==null?0:mChatList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mChatList.get(position).getType();
    }
    protected abstract int getLayoutId(int viewType);
    protected abstract AbsBinderHolder createHolder(View view,int viewType);
}
