package com.example.uts_pb;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AddMemoFragment extends Fragment {

    private EditText editTitle, editContent;
    private Button btnSave;

    public AddMemoFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_memo, container, false);

        editTitle = view.findViewById(R.id.editTitle);
        editContent = view.findViewById(R.id.editContent);
        btnSave = view.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(v -> {
            String title = editTitle.getText().toString().trim();
            String content = editContent.getText().toString().trim();

            if (TextUtils.isEmpty(title) || TextUtils.isEmpty(content)) {
                Toast.makeText(getActivity(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
            } else {
                // Simpan ke MemoData
                Memo memo = new Memo(title, content);
                MemoData.addMemo(memo);

                Toast.makeText(getActivity(), "Memo Disimpan!", Toast.LENGTH_SHORT).show();

                // Reset form
                editTitle.setText("");
                editContent.setText("");
            }
        });

        return view;
    }
}
