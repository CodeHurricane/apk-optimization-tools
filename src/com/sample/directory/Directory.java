package com.sample.directory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;

public abstract interface Directory
{
  public static final char separator = 47;

  public abstract Set<String> getFiles();

  public abstract Set<String> getFiles(boolean paramBoolean);

  public abstract Map<String, Directory> getDirs();

  public abstract Map<String, Directory> getDirs(boolean paramBoolean);

  public abstract boolean containsFile(String paramString);

  public abstract boolean containsDir(String paramString);

  public abstract InputStream getFileInput(String paramString)
    throws DirectoryException;

  public abstract OutputStream getFileOutput(String paramString)
    throws DirectoryException;

  public abstract Directory getDir(String paramString)
    throws PathNotExist;

  public abstract Directory createDir(String paramString)
    throws DirectoryException;

  public abstract boolean removeFile(String paramString);
}