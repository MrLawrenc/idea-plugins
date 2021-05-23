package com.github.lawrenc.processor;


import com.github.lawrenc.data.NoteData;

import java.util.List;

public interface SourceNoteData {
    public String getFileName();

    public String getTopic();

    public List<NoteData> getNoteList();


}
