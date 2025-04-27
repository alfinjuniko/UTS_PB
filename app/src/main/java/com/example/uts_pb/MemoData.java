package com.example.uts_pb;
import java.util.ArrayList;
import java.util.List;

public class MemoData {
    // Daftar untuk menyimpan memo
    private static List<Memo> memoList = new ArrayList<>();

    // Menambahkan memo baru ke dalam daftar
    public static void addMemo(Memo memo) {
        memoList.add(memo);
    }

    // Mendapatkan seluruh daftar memo
    public static List<Memo> getMemoList() {
        return memoList;
    }
}
