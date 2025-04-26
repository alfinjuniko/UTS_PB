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
import java.util.ArrayList;
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

        // Dummy data dulu
        memoList = new ArrayList<>();
        memoList.add(new Memo("Belanja", "Beli sayur, buah, susu"));
        memoList.add(new Memo("Tugas", "Kumpulkan project hari Senin"));

        memoAdapter = new MemoAdapter(memoList);
        recyclerView.setAdapter(memoAdapter);

        return view;
    }
}
