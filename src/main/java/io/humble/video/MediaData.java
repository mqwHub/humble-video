/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * The parent class of all media objects than can be gotten from or 
 * added to a {@link Stream}.  
 */
public class MediaData extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaData(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGMediaDataUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaData(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGMediaDataUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaData obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaData object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaData copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaData(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaData)
      equal = (((MediaData)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  // used to correct timezone offsets for timestamp format 

  private static final long TIME_OFFSET = -java.util.Calendar.getInstance()
    .getTimeZone().getRawOffset();

  /** The default time stamp format. */
  
  public static final String DEFAULT_TIME_STAMP_FORMAT =
    "%1$tH:%1$tM:%1$tS.%1$tL";
/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(byte[], int, int, int)
 */
public void put(byte[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, byte[], int, int)
 */
public void get(int srcPos, byte[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}

/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(char[], int, int, int)
 */
public void put(char[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, char[], int, int)
 */
public void get(int srcPos, char[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}

/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(short[], int, int, int)
 */
public void put(short[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, short[], int, int)
 */
public void get(int srcPos, short[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}

/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(int[], int, int, int)
 */
public void put(int[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, int[], int, int)
 */
public void get(int srcPos, int[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}

/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(long[], int, int, int)
 */
public void put(long[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, long[], int, int)
 */
public void get(int srcPos, long[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}

/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(float[], int, int, int)
 */
public void put(float[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, float[], int, int)
 */
public void get(int srcPos, float[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}

/**
 * Absolute bulk put method.
 * <p>
 * This method delegates to the same put method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#put(double[], int, int, int)
 */
public void put(double[] src, int srcPos, int destPos, int length)
{
  io.humble.ferry.IBuffer buffer = getDataCached();
  if (buffer == null)
    return;
  buffer.put(src, srcPos, destPos, length);
  return;
}

/**
 * Absolute bulk get method.
 * <p>
 * This method delegates to the same get method on the
 * underlying {@link io.humble.ferry.IBuffer} returned from {@link #getData()} ,
 * but may be more efficient in some {@link io.humble.ferry.JNIMemoryManager.MemoryModel}
 * configurations.
 * </p>
 * @see io.humble.ferry.IBuffer#get(int, double[], int, int)
 */
public void get(int srcPos, double[] dest, int destPos, int length)
{
   io.humble.ferry.IBuffer buffer = getDataCached();
   if (buffer == null)
     return;
   buffer.get(srcPos, dest, destPos, length);
   return;
}


  /**
   * Gets the underlying {@link java.nio.ByteBuffer} for this {@link
   * MediaData} object.  Users may modify the contents of the
   * ByteBuffer and their changes will be reflected in the underlying
   * memory.  See {@link io.humble.ferry.IBuffer} for the warnings
   * associated with the use of raw memory.  The buffer position and
   * mark are initialized to zero, and the limit is initialized to the
   * number of elements in the buffer.
   *
   * <p>
   *
   * This is a convenience method to allow you to avoid getting the
   * IBuffer object that has the actual data.
   *
   * </p>
   *
   * @return The underlying ByteBuffer
   * 
   * @see io.humble.ferry.IBuffer#getByteBuffer(int, int)
   */

  public java.nio.ByteBuffer getByteBuffer()
  {
    return getByteBuffer(null);
  }

  /**
   * Gets the underlying {@link java.nio.ByteBuffer} for this {@link
   * MediaData} object.  Users may modify the contents of the
   * ByteBuffer and their changes will be reflected in the underlying
   * memory.  See {@link io.humble.ferry.IBuffer} for the warnings
   * associated with the use of raw memory.  The buffer position and
   * mark are initialized to zero, and the limit is initialized to the
   * number of elements in the buffer.
   *
   * <p>
   *
   * This is a convenience method to allow you to avoid getting the
   * IBuffer object that has the actual data.
   *
   * </p>
   *
   * @param ref A reference that on return from this method will
   *   contain a {@link io.humble.ferry.JNIReference} object
   *   that can be used for explicit memory management.
   * @return The underlying ByteBuffer
   * 
   * @see io.humble.ferry.IBuffer#getByteBuffer(int, int, java.util.concurrent.atomic.AtomicReference)
   */

  public java.nio.ByteBuffer getByteBuffer(
      java.util.concurrent.atomic.AtomicReference<io.humble.ferry.JNIReference> ref) {
    if (ref != null)
      ref.set(null);
      
    io.humble.ferry.IBuffer buf = this.getDataCached();
    if (buf == null)
      return null;
    java.nio.ByteBuffer byteBuffer = buf.getByteBuffer(0, this.getSize(), ref);
    if (byteBuffer != null)
    {
      byteBuffer.position(0);
      byteBuffer.mark();
      byteBuffer.limit(this.getSize());
    }
    return byteBuffer;
  }


  /**
   * Get a string representation of the time stamp for this {@link
   * MediaData}.  The time is formatted as: <b>HH:MM:SS.ms</b>
   *
   * @return the printable string form of the time stamp of this media
   *
   * @see #getFormattedTimeStamp(String)
   * @see #DEFAULT_TIME_STAMP_FORMAT
   */

  public String getFormattedTimeStamp()
  {
    return getFormattedTimeStamp(DEFAULT_TIME_STAMP_FORMAT);
  }

  /**
   * Get a string representation of the time stamp for this {@link
   * MediaData}.  The format of the resulting string is specified by
   * the format parameter.  See {@link java.util.Formatter} for 
   * details on how to specify formats, however a good place to start
   * is with the following format: <b>%1$tH:%1$tM:%1$tS.%1$tL</b>
   *
   * @param format the format for the time stamp string
   *
   * @return the printable string form of the timestamp
   * 
   * @see #getFormattedTimeStamp()
   * @see #DEFAULT_TIME_STAMP_FORMAT
   * @see java.util.Formatter
   */

  public String getFormattedTimeStamp(String format)
  {
    String retval = null;
    java.util.Formatter formatter = new java.util.Formatter();

    try {
      Rational timeBase = getTimeBase();
      if (timeBase == null)
        timeBase = Rational.make(1,(int)Global.DEFAULT_PTS_PER_SECOND);
      retval = formatter.format(format,
          (long)(getTimeStamp() * timeBase.getDouble() * 1000) +
          TIME_OFFSET).toString();
      timeBase.delete();
    } finally {
      formatter.close();
    }
    return retval;
  }
  
  /**
   * The data used by {@link #getDataCached()}.
   */
  private io.humble.ferry.IBuffer mData;

  /**
   * Get any underlying raw data available for this object.
   * 
   * @return The raw data, or null if not accessible.
   */
  public io.humble.ferry.IBuffer getData()
  {
    io.humble.ferry.IBuffer retval = getData_internal();
    if (retval == null)
    {
       if (mData != null)
         mData.delete();
       mData = retval;
    } else {
      if (mData == null) {
        mData = retval.copyReference();
      } else {
        if (!mData.equals(retval))
        {
          mData.delete();
          mData = retval.copyReference();
        }
      }
    }
    return retval;
  }
  
  /**
   * Sets the underlying buffer used by this object.
   * <p>
   * This is an advanced method and is not recommended for use by those
   * who don't fully understand how IBuffers work.  Implementations of
   * {@link MediaData} may behave in undefined ways if the buffer you
   * pass in is not big enough for what you ask them to do (e.g. they may
   * discard your buffer and allocate a larger one if they need more space).
   * It is up to the caller to ensure the buffer passed in is large enough,
   * and is not simultaneously in use by another part of the system.
   * </p>
   * @param buffer The buffer to set.
   */
  public void setData(io.humble.ferry.IBuffer buffer)
  {
    if (buffer == null)
    {
      if (mData != null)
        mData.delete();
      mData = buffer;
    } else {
      if (mData == null) {
        mData = buffer.copyReference();
      } else {
        if (!mData.equals(buffer))
        {
          mData.delete();
          mData = buffer.copyReference();
        }
      }
    }
    setData_internal(buffer);
  }

  /**
   * Get any underlying raw data available for this object, but do
   * not create a new Java wrapping object for it.
   *
   * <p>
   * Do not call {@link io.humble.ferry.RefCounted#delete()} on
   * the returned value. 
   * </p>
   * 
   * @return The raw data, or null if not accessible.
   * @since 3.2
   */
  public io.humble.ferry.IBuffer getDataCached()
  {
    if (mData == null)
      mData = getData_internal(); // Try crossing the boundary anyway
    return mData;
  }

  /**
   * Releases this instance of MediaData and frees any underlying
   * native memory.
   * <p>
   * {@inheritDoc}
   * </p> 
   */
  @Override
  public void delete()
  {
    if (mData != null) {
      mData.delete();
      mData = null;
    }
    super.delete();
  }


  

/**
 * Get the time stamp of this object in getTimeBase() units.  
 * @return	the time stamp  
 */
  public long getTimeStamp() {
    return VideoJNI.MediaData_getTimeStamp(swigCPtr, this);
  }

/**
 * Set the time stamp for this object in getTimeBase() units.  
 * @param	aTimeStamp The time stamp  
 */
  public void setTimeStamp(long aTimeStamp) {
    VideoJNI.MediaData_setTimeStamp(swigCPtr, this, aTimeStamp);
  }

/**
 * Get the time base that time stamps of this object are represented 
 * in.  
 * Caller must release the returned value.  
 * @return	the time base.  
 */
  public Rational getTimeBase() {
    long cPtr = VideoJNI.MediaData_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

/**
 * Set the time base that time stamps of this object are represented 
 * in.  
 *  
 */
  public void setTimeBase(Rational aBase) {
    VideoJNI.MediaData_setTimeBase(swigCPtr, this, Rational.getCPtr(aBase), aBase);
  }

/**
 * Get any underlying raw data available for this object.  
 * @return	The raw data, or null if not accessible.  
 */
  protected IBuffer getData_internal() {
    long cPtr = VideoJNI.MediaData_getData_internal(swigCPtr, this);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

/**
 * Get the size in bytes of the raw data available for this object. 
 *  
 * @return	the size in bytes, or -1 if it cannot be computed.  
 */
  public int getSize() {
    return VideoJNI.MediaData_getSize(swigCPtr, this);
  }

/**
 * Is this object a key object? i.e. it can be interpreted without needing 
 * any other media objects  
 * @return	true if it's a key, false if not  
 */
  public boolean isKey() {
    return VideoJNI.MediaData_isKey(swigCPtr, this);
  }

/**
 * Sets the underlying buffer used by this object.  
 * <p>  
 * This is an advanced method and is not recommended for use by those 
 *  
 * who don't fully understand how IBuffers work. Implementations of 
 *  
 * {@link MediaData} may behave in undefined ways if the buffer you 
 *  
 * pass in is not big enough for what you ask them to do (e.g. they 
 * may  
 * discard your buffer and allocate a larger one if they need more space). 
 *  
 * It is up to the caller to ensure the buffer passed in is large enough, 
 *  
 *  
 * </p>  
 * @param	buffer The buffer to set. If null, this method  
 * is ignored.  
 */
  protected void setData_internal(IBuffer buffer) {
    VideoJNI.MediaData_setData_internal(swigCPtr, this, IBuffer.getCPtr(buffer), buffer);
  }

}
