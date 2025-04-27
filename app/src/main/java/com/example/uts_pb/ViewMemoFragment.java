package com.example.uts_pb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ViewMemoFragment extends Fragment {

    private RecyclerView recyclerView;
    private MemoAdapter memoAdapter;
    private List<Memo> memoList;

    public ViewMemoFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_memo, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Ambil data memo dari MemoData
        memoList = MemoData.getMemoList();

        memoAdapter = new MemoAdapter(memoList);
        recyclerView.setAdapter(memoAdapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // Update RecyclerView setiap kali balik ke halaman ini
        if (memoAdapter != null) {
            memoAdapter.notifyDataSetChanged();
        }
    }
}
