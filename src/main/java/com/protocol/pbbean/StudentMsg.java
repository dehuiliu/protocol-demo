// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StudentMsg.proto
package com.protocol.pbbean;

public final class StudentMsg {
  private StudentMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StudentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Student)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 姓名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * 姓名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * 年龄
     * </pre>
     *
     * <code>int32 age = 3;</code>
     */
    int getAge();

    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    java.util.List<java.lang.String>
        getHabitsList();
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    int getHabitsCount();
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    java.lang.String getHabits(int index);
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    com.google.protobuf.ByteString
        getHabitsBytes(int index);
  }
  /**
   * Protobuf type {@code Student}
   */
  public  static final class Student extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Student)
      StudentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Student.newBuilder() to construct.
    private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Student() {
      name_ = "";
      age_ = 0;
      habits_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Student(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 24: {

              age_ = input.readInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                habits_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              habits_.add(s);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          habits_ = habits_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StudentMsg.internal_static_Student_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StudentMsg.internal_static_Student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StudentMsg.Student.class, StudentMsg.Student.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * 姓名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 姓名
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <pre>
     * 年龄
     * </pre>
     *
     * <code>int32 age = 3;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int HABITS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList habits_;
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getHabitsList() {
      return habits_;
    }
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    public int getHabitsCount() {
      return habits_.size();
    }
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    public java.lang.String getHabits(int index) {
      return habits_.get(index);
    }
    /**
     * <pre>
     * 习惯（集合）
     * </pre>
     *
     * <code>repeated string habits = 4;</code>
     */
    public com.google.protobuf.ByteString
        getHabitsBytes(int index) {
      return habits_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (age_ != 0) {
        output.writeInt32(3, age_);
      }
      for (int i = 0; i < habits_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, habits_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < habits_.size(); i++) {
          dataSize += computeStringSizeNoTag(habits_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getHabitsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof StudentMsg.Student)) {
        return super.equals(obj);
      }
      StudentMsg.Student other = (StudentMsg.Student) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && (getAge()
          == other.getAge());
      result = result && getHabitsList()
          .equals(other.getHabitsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      if (getHabitsCount() > 0) {
        hash = (37 * hash) + HABITS_FIELD_NUMBER;
        hash = (53 * hash) + getHabitsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static StudentMsg.Student parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentMsg.Student parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentMsg.Student parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentMsg.Student parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentMsg.Student parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StudentMsg.Student parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StudentMsg.Student parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StudentMsg.Student parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static StudentMsg.Student parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static StudentMsg.Student parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static StudentMsg.Student parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StudentMsg.Student parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(StudentMsg.Student prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Student}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Student)
        StudentMsg.StudentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StudentMsg.internal_static_Student_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StudentMsg.internal_static_Student_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StudentMsg.Student.class, StudentMsg.Student.Builder.class);
      }

      // Construct using StudentMsg.Student.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        habits_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return StudentMsg.internal_static_Student_descriptor;
      }

      public StudentMsg.Student getDefaultInstanceForType() {
        return StudentMsg.Student.getDefaultInstance();
      }

      public StudentMsg.Student build() {
        StudentMsg.Student result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public StudentMsg.Student buildPartial() {
        StudentMsg.Student result = new StudentMsg.Student(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.name_ = name_;
        result.age_ = age_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          habits_ = habits_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.habits_ = habits_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StudentMsg.Student) {
          return mergeFrom((StudentMsg.Student)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StudentMsg.Student other) {
        if (other == StudentMsg.Student.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (!other.habits_.isEmpty()) {
          if (habits_.isEmpty()) {
            habits_ = other.habits_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureHabitsIsMutable();
            habits_.addAll(other.habits_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StudentMsg.Student parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StudentMsg.Student) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * 姓名
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 姓名
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 姓名
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 姓名
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 姓名
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <pre>
       * 年龄
       * </pre>
       *
       * <code>int32 age = 3;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <pre>
       * 年龄
       * </pre>
       *
       * <code>int32 age = 3;</code>
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 年龄
       * </pre>
       *
       * <code>int32 age = 3;</code>
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList habits_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureHabitsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          habits_ = new com.google.protobuf.LazyStringArrayList(habits_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getHabitsList() {
        return habits_.getUnmodifiableView();
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public int getHabitsCount() {
        return habits_.size();
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public java.lang.String getHabits(int index) {
        return habits_.get(index);
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public com.google.protobuf.ByteString
          getHabitsBytes(int index) {
        return habits_.getByteString(index);
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public Builder setHabits(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHabitsIsMutable();
        habits_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public Builder addHabits(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureHabitsIsMutable();
        habits_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public Builder addAllHabits(
          java.lang.Iterable<java.lang.String> values) {
        ensureHabitsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, habits_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public Builder clearHabits() {
        habits_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 习惯（集合）
       * </pre>
       *
       * <code>repeated string habits = 4;</code>
       */
      public Builder addHabitsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureHabitsIsMutable();
        habits_.add(value);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Student)
    }

    // @@protoc_insertion_point(class_scope:Student)
    private static final StudentMsg.Student DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StudentMsg.Student();
    }

    public static StudentMsg.Student getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Student>
        PARSER = new com.google.protobuf.AbstractParser<Student>() {
      public Student parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Student(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Student> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Student> getParserForType() {
      return PARSER;
    }

    public StudentMsg.Student getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020StudentMsg.proto\"4\n\007Student\022\014\n\004name\030\002 " +
      "\001(\t\022\013\n\003age\030\003 \001(\005\022\016\n\006habits\030\004 \003(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_descriptor,
        new java.lang.String[] { "Name", "Age", "Habits", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}