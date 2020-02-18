// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Deltas.proto

#include "Deltas.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>
extern PROTOBUF_INTERNAL_EXPORT_Transaction_2eproto ::PROTOBUF_NAMESPACE_ID::internal::SCCInfo<0> scc_info_CoinbaseEntry_Transaction_2eproto;
extern PROTOBUF_INTERNAL_EXPORT_Transaction_2eproto ::PROTOBUF_NAMESPACE_ID::internal::SCCInfo<1> scc_info_ConfidentialEntry_Transaction_2eproto;
extern PROTOBUF_INTERNAL_EXPORT_Transaction_2eproto ::PROTOBUF_NAMESPACE_ID::internal::SCCInfo<2> scc_info_PublicEntry_Transaction_2eproto;
extern PROTOBUF_INTERNAL_EXPORT_google_2fprotobuf_2ftimestamp_2eproto ::PROTOBUF_NAMESPACE_ID::internal::SCCInfo<0> scc_info_Timestamp_google_2fprotobuf_2ftimestamp_2eproto;
namespace Catalyst {
namespace Protocol {
namespace Deltas {
class DeltaIndexDefaultTypeInternal {
 public:
  ::PROTOBUF_NAMESPACE_ID::internal::ExplicitlyConstructed<DeltaIndex> _instance;
} _DeltaIndex_default_instance_;
class DeltaDefaultTypeInternal {
 public:
  ::PROTOBUF_NAMESPACE_ID::internal::ExplicitlyConstructed<Delta> _instance;
} _Delta_default_instance_;
}  // namespace Deltas
}  // namespace Protocol
}  // namespace Catalyst
static void InitDefaultsscc_info_Delta_Deltas_2eproto() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  {
    void* ptr = &::Catalyst::Protocol::Deltas::_Delta_default_instance_;
    new (ptr) ::Catalyst::Protocol::Deltas::Delta();
    ::PROTOBUF_NAMESPACE_ID::internal::OnShutdownDestroyMessage(ptr);
  }
  ::Catalyst::Protocol::Deltas::Delta::InitAsDefaultInstance();
}

::PROTOBUF_NAMESPACE_ID::internal::SCCInfo<4> scc_info_Delta_Deltas_2eproto =
    {{ATOMIC_VAR_INIT(::PROTOBUF_NAMESPACE_ID::internal::SCCInfoBase::kUninitialized), 4, 0, InitDefaultsscc_info_Delta_Deltas_2eproto}, {
      &scc_info_Timestamp_google_2fprotobuf_2ftimestamp_2eproto.base,
      &scc_info_PublicEntry_Transaction_2eproto.base,
      &scc_info_ConfidentialEntry_Transaction_2eproto.base,
      &scc_info_CoinbaseEntry_Transaction_2eproto.base,}};

static void InitDefaultsscc_info_DeltaIndex_Deltas_2eproto() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  {
    void* ptr = &::Catalyst::Protocol::Deltas::_DeltaIndex_default_instance_;
    new (ptr) ::Catalyst::Protocol::Deltas::DeltaIndex();
    ::PROTOBUF_NAMESPACE_ID::internal::OnShutdownDestroyMessage(ptr);
  }
  ::Catalyst::Protocol::Deltas::DeltaIndex::InitAsDefaultInstance();
}

::PROTOBUF_NAMESPACE_ID::internal::SCCInfo<0> scc_info_DeltaIndex_Deltas_2eproto =
    {{ATOMIC_VAR_INIT(::PROTOBUF_NAMESPACE_ID::internal::SCCInfoBase::kUninitialized), 0, 0, InitDefaultsscc_info_DeltaIndex_Deltas_2eproto}, {}};

static ::PROTOBUF_NAMESPACE_ID::Metadata file_level_metadata_Deltas_2eproto[2];
static constexpr ::PROTOBUF_NAMESPACE_ID::EnumDescriptor const** file_level_enum_descriptors_Deltas_2eproto = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::ServiceDescriptor const** file_level_service_descriptors_Deltas_2eproto = nullptr;

const ::PROTOBUF_NAMESPACE_ID::uint32 TableStruct_Deltas_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::DeltaIndex, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::DeltaIndex, height_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::DeltaIndex, cid_),
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, previous_delta_dfs_hash_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, merkle_root_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, merkle_poda_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, time_stamp_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, public_entries_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, confidential_entries_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, coinbase_entries_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, state_root_),
  PROTOBUF_FIELD_OFFSET(::Catalyst::Protocol::Deltas::Delta, delta_number_),
};
static const ::PROTOBUF_NAMESPACE_ID::internal::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, sizeof(::Catalyst::Protocol::Deltas::DeltaIndex)},
  { 7, -1, sizeof(::Catalyst::Protocol::Deltas::Delta)},
};

static ::PROTOBUF_NAMESPACE_ID::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::Catalyst::Protocol::Deltas::_DeltaIndex_default_instance_),
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::Catalyst::Protocol::Deltas::_Delta_default_instance_),
};

const char descriptor_table_protodef_Deltas_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\014Deltas.proto\022\030Catalyst.Protocol.Deltas"
  "\032\021Transaction.proto\032\037google/protobuf/tim"
  "estamp.proto\")\n\nDeltaIndex\022\016\n\006height\030\001 \001"
  "(\r\022\013\n\003cid\030\002 \001(\014\"\210\003\n\005Delta\022\037\n\027previous_de"
  "lta_dfs_hash\030\001 \001(\014\022\023\n\013merkle_root\030\002 \001(\014\022"
  "\023\n\013merkle_poda\030\003 \001(\014\022.\n\ntime_stamp\030\004 \001(\013"
  "2\032.google.protobuf.Timestamp\022B\n\016public_e"
  "ntries\030\005 \003(\0132*.Catalyst.Protocol.Transac"
  "tion.PublicEntry\022N\n\024confidential_entries"
  "\030\006 \003(\01320.Catalyst.Protocol.Transaction.C"
  "onfidentialEntry\022F\n\020coinbase_entries\030\007 \003"
  "(\0132,.Catalyst.Protocol.Transaction.Coinb"
  "aseEntry\022\022\n\nstate_root\030\010 \001(\014\022\024\n\014delta_nu"
  "mber\030\t \001(\003B\002P\001b\006proto3"
  ;
static const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable*const descriptor_table_Deltas_2eproto_deps[2] = {
  &::descriptor_table_Transaction_2eproto,
  &::descriptor_table_google_2fprotobuf_2ftimestamp_2eproto,
};
static ::PROTOBUF_NAMESPACE_ID::internal::SCCInfoBase*const descriptor_table_Deltas_2eproto_sccs[2] = {
  &scc_info_Delta_Deltas_2eproto.base,
  &scc_info_DeltaIndex_Deltas_2eproto.base,
};
static ::PROTOBUF_NAMESPACE_ID::internal::once_flag descriptor_table_Deltas_2eproto_once;
static bool descriptor_table_Deltas_2eproto_initialized = false;
const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_Deltas_2eproto = {
  &descriptor_table_Deltas_2eproto_initialized, descriptor_table_protodef_Deltas_2eproto, "Deltas.proto", 542,
  &descriptor_table_Deltas_2eproto_once, descriptor_table_Deltas_2eproto_sccs, descriptor_table_Deltas_2eproto_deps, 2, 2,
  schemas, file_default_instances, TableStruct_Deltas_2eproto::offsets,
  file_level_metadata_Deltas_2eproto, 2, file_level_enum_descriptors_Deltas_2eproto, file_level_service_descriptors_Deltas_2eproto,
};

// Force running AddDescriptors() at dynamic initialization time.
static bool dynamic_init_dummy_Deltas_2eproto = (  ::PROTOBUF_NAMESPACE_ID::internal::AddDescriptors(&descriptor_table_Deltas_2eproto), true);
namespace Catalyst {
namespace Protocol {
namespace Deltas {

// ===================================================================

void DeltaIndex::InitAsDefaultInstance() {
}
class DeltaIndex::_Internal {
 public:
};

DeltaIndex::DeltaIndex()
  : ::PROTOBUF_NAMESPACE_ID::Message(), _internal_metadata_(nullptr) {
  SharedCtor();
  // @@protoc_insertion_point(constructor:Catalyst.Protocol.Deltas.DeltaIndex)
}
DeltaIndex::DeltaIndex(const DeltaIndex& from)
  : ::PROTOBUF_NAMESPACE_ID::Message(),
      _internal_metadata_(nullptr) {
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  cid_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_cid().empty()) {
    cid_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.cid_);
  }
  height_ = from.height_;
  // @@protoc_insertion_point(copy_constructor:Catalyst.Protocol.Deltas.DeltaIndex)
}

void DeltaIndex::SharedCtor() {
  ::PROTOBUF_NAMESPACE_ID::internal::InitSCC(&scc_info_DeltaIndex_Deltas_2eproto.base);
  cid_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  height_ = 0u;
}

DeltaIndex::~DeltaIndex() {
  // @@protoc_insertion_point(destructor:Catalyst.Protocol.Deltas.DeltaIndex)
  SharedDtor();
}

void DeltaIndex::SharedDtor() {
  cid_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
}

void DeltaIndex::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}
const DeltaIndex& DeltaIndex::default_instance() {
  ::PROTOBUF_NAMESPACE_ID::internal::InitSCC(&::scc_info_DeltaIndex_Deltas_2eproto.base);
  return *internal_default_instance();
}


void DeltaIndex::Clear() {
// @@protoc_insertion_point(message_clear_start:Catalyst.Protocol.Deltas.DeltaIndex)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cid_.ClearToEmptyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  height_ = 0u;
  _internal_metadata_.Clear();
}

const char* DeltaIndex::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    ::PROTOBUF_NAMESPACE_ID::uint32 tag;
    ptr = ::PROTOBUF_NAMESPACE_ID::internal::ReadTag(ptr, &tag);
    CHK_(ptr);
    switch (tag >> 3) {
      // uint32 height = 1;
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 8)) {
          height_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // bytes cid = 2;
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 18)) {
          auto str = _internal_mutable_cid();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      default: {
      handle_unusual:
        if ((tag & 7) == 4 || tag == 0) {
          ctx->SetLastTag(tag);
          goto success;
        }
        ptr = UnknownFieldParse(tag, &_internal_metadata_, ptr, ctx);
        CHK_(ptr != nullptr);
        continue;
      }
    }  // switch
  }  // while
success:
  return ptr;
failure:
  ptr = nullptr;
  goto success;
#undef CHK_
}

::PROTOBUF_NAMESPACE_ID::uint8* DeltaIndex::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:Catalyst.Protocol.Deltas.DeltaIndex)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // uint32 height = 1;
  if (this->height() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt32ToArray(1, this->_internal_height(), target);
  }

  // bytes cid = 2;
  if (this->cid().size() > 0) {
    target = stream->WriteBytesMaybeAliased(
        2, this->_internal_cid(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields(), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:Catalyst.Protocol.Deltas.DeltaIndex)
  return target;
}

size_t DeltaIndex::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:Catalyst.Protocol.Deltas.DeltaIndex)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // bytes cid = 2;
  if (this->cid().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::BytesSize(
        this->_internal_cid());
  }

  // uint32 height = 1;
  if (this->height() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt32Size(
        this->_internal_height());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

void DeltaIndex::MergeFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:Catalyst.Protocol.Deltas.DeltaIndex)
  GOOGLE_DCHECK_NE(&from, this);
  const DeltaIndex* source =
      ::PROTOBUF_NAMESPACE_ID::DynamicCastToGenerated<DeltaIndex>(
          &from);
  if (source == nullptr) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:Catalyst.Protocol.Deltas.DeltaIndex)
    ::PROTOBUF_NAMESPACE_ID::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:Catalyst.Protocol.Deltas.DeltaIndex)
    MergeFrom(*source);
  }
}

void DeltaIndex::MergeFrom(const DeltaIndex& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:Catalyst.Protocol.Deltas.DeltaIndex)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.cid().size() > 0) {

    cid_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.cid_);
  }
  if (from.height() != 0) {
    _internal_set_height(from._internal_height());
  }
}

void DeltaIndex::CopyFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:Catalyst.Protocol.Deltas.DeltaIndex)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void DeltaIndex::CopyFrom(const DeltaIndex& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:Catalyst.Protocol.Deltas.DeltaIndex)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool DeltaIndex::IsInitialized() const {
  return true;
}

void DeltaIndex::InternalSwap(DeltaIndex* other) {
  using std::swap;
  _internal_metadata_.Swap(&other->_internal_metadata_);
  cid_.Swap(&other->cid_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
    GetArenaNoVirtual());
  swap(height_, other->height_);
}

::PROTOBUF_NAMESPACE_ID::Metadata DeltaIndex::GetMetadata() const {
  return GetMetadataStatic();
}


// ===================================================================

void Delta::InitAsDefaultInstance() {
  ::Catalyst::Protocol::Deltas::_Delta_default_instance_._instance.get_mutable()->time_stamp_ = const_cast< PROTOBUF_NAMESPACE_ID::Timestamp*>(
      PROTOBUF_NAMESPACE_ID::Timestamp::internal_default_instance());
}
class Delta::_Internal {
 public:
  static const PROTOBUF_NAMESPACE_ID::Timestamp& time_stamp(const Delta* msg);
};

const PROTOBUF_NAMESPACE_ID::Timestamp&
Delta::_Internal::time_stamp(const Delta* msg) {
  return *msg->time_stamp_;
}
void Delta::clear_time_stamp() {
  if (GetArenaNoVirtual() == nullptr && time_stamp_ != nullptr) {
    delete time_stamp_;
  }
  time_stamp_ = nullptr;
}
void Delta::clear_public_entries() {
  public_entries_.Clear();
}
void Delta::clear_confidential_entries() {
  confidential_entries_.Clear();
}
void Delta::clear_coinbase_entries() {
  coinbase_entries_.Clear();
}
Delta::Delta()
  : ::PROTOBUF_NAMESPACE_ID::Message(), _internal_metadata_(nullptr) {
  SharedCtor();
  // @@protoc_insertion_point(constructor:Catalyst.Protocol.Deltas.Delta)
}
Delta::Delta(const Delta& from)
  : ::PROTOBUF_NAMESPACE_ID::Message(),
      _internal_metadata_(nullptr),
      public_entries_(from.public_entries_),
      confidential_entries_(from.confidential_entries_),
      coinbase_entries_(from.coinbase_entries_) {
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  previous_delta_dfs_hash_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_previous_delta_dfs_hash().empty()) {
    previous_delta_dfs_hash_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.previous_delta_dfs_hash_);
  }
  merkle_root_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_merkle_root().empty()) {
    merkle_root_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.merkle_root_);
  }
  merkle_poda_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_merkle_poda().empty()) {
    merkle_poda_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.merkle_poda_);
  }
  state_root_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_state_root().empty()) {
    state_root_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.state_root_);
  }
  if (from._internal_has_time_stamp()) {
    time_stamp_ = new PROTOBUF_NAMESPACE_ID::Timestamp(*from.time_stamp_);
  } else {
    time_stamp_ = nullptr;
  }
  delta_number_ = from.delta_number_;
  // @@protoc_insertion_point(copy_constructor:Catalyst.Protocol.Deltas.Delta)
}

void Delta::SharedCtor() {
  ::PROTOBUF_NAMESPACE_ID::internal::InitSCC(&scc_info_Delta_Deltas_2eproto.base);
  previous_delta_dfs_hash_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  merkle_root_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  merkle_poda_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  state_root_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  ::memset(&time_stamp_, 0, static_cast<size_t>(
      reinterpret_cast<char*>(&delta_number_) -
      reinterpret_cast<char*>(&time_stamp_)) + sizeof(delta_number_));
}

Delta::~Delta() {
  // @@protoc_insertion_point(destructor:Catalyst.Protocol.Deltas.Delta)
  SharedDtor();
}

void Delta::SharedDtor() {
  previous_delta_dfs_hash_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  merkle_root_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  merkle_poda_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  state_root_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (this != internal_default_instance()) delete time_stamp_;
}

void Delta::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}
const Delta& Delta::default_instance() {
  ::PROTOBUF_NAMESPACE_ID::internal::InitSCC(&::scc_info_Delta_Deltas_2eproto.base);
  return *internal_default_instance();
}


void Delta::Clear() {
// @@protoc_insertion_point(message_clear_start:Catalyst.Protocol.Deltas.Delta)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  public_entries_.Clear();
  confidential_entries_.Clear();
  coinbase_entries_.Clear();
  previous_delta_dfs_hash_.ClearToEmptyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  merkle_root_.ClearToEmptyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  merkle_poda_.ClearToEmptyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  state_root_.ClearToEmptyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (GetArenaNoVirtual() == nullptr && time_stamp_ != nullptr) {
    delete time_stamp_;
  }
  time_stamp_ = nullptr;
  delta_number_ = PROTOBUF_LONGLONG(0);
  _internal_metadata_.Clear();
}

const char* Delta::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    ::PROTOBUF_NAMESPACE_ID::uint32 tag;
    ptr = ::PROTOBUF_NAMESPACE_ID::internal::ReadTag(ptr, &tag);
    CHK_(ptr);
    switch (tag >> 3) {
      // bytes previous_delta_dfs_hash = 1;
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 10)) {
          auto str = _internal_mutable_previous_delta_dfs_hash();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // bytes merkle_root = 2;
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 18)) {
          auto str = _internal_mutable_merkle_root();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // bytes merkle_poda = 3;
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 26)) {
          auto str = _internal_mutable_merkle_poda();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // .google.protobuf.Timestamp time_stamp = 4;
      case 4:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 34)) {
          ptr = ctx->ParseMessage(_internal_mutable_time_stamp(), ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;
      case 5:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 42)) {
          ptr -= 1;
          do {
            ptr += 1;
            ptr = ctx->ParseMessage(_internal_add_public_entries(), ptr);
            CHK_(ptr);
            if (!ctx->DataAvailable(ptr)) break;
          } while (::PROTOBUF_NAMESPACE_ID::internal::ExpectTag<42>(ptr));
        } else goto handle_unusual;
        continue;
      // repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;
      case 6:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 50)) {
          ptr -= 1;
          do {
            ptr += 1;
            ptr = ctx->ParseMessage(_internal_add_confidential_entries(), ptr);
            CHK_(ptr);
            if (!ctx->DataAvailable(ptr)) break;
          } while (::PROTOBUF_NAMESPACE_ID::internal::ExpectTag<50>(ptr));
        } else goto handle_unusual;
        continue;
      // repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;
      case 7:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 58)) {
          ptr -= 1;
          do {
            ptr += 1;
            ptr = ctx->ParseMessage(_internal_add_coinbase_entries(), ptr);
            CHK_(ptr);
            if (!ctx->DataAvailable(ptr)) break;
          } while (::PROTOBUF_NAMESPACE_ID::internal::ExpectTag<58>(ptr));
        } else goto handle_unusual;
        continue;
      // bytes state_root = 8;
      case 8:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 66)) {
          auto str = _internal_mutable_state_root();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // int64 delta_number = 9;
      case 9:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 72)) {
          delta_number_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      default: {
      handle_unusual:
        if ((tag & 7) == 4 || tag == 0) {
          ctx->SetLastTag(tag);
          goto success;
        }
        ptr = UnknownFieldParse(tag, &_internal_metadata_, ptr, ctx);
        CHK_(ptr != nullptr);
        continue;
      }
    }  // switch
  }  // while
success:
  return ptr;
failure:
  ptr = nullptr;
  goto success;
#undef CHK_
}

::PROTOBUF_NAMESPACE_ID::uint8* Delta::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:Catalyst.Protocol.Deltas.Delta)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // bytes previous_delta_dfs_hash = 1;
  if (this->previous_delta_dfs_hash().size() > 0) {
    target = stream->WriteBytesMaybeAliased(
        1, this->_internal_previous_delta_dfs_hash(), target);
  }

  // bytes merkle_root = 2;
  if (this->merkle_root().size() > 0) {
    target = stream->WriteBytesMaybeAliased(
        2, this->_internal_merkle_root(), target);
  }

  // bytes merkle_poda = 3;
  if (this->merkle_poda().size() > 0) {
    target = stream->WriteBytesMaybeAliased(
        3, this->_internal_merkle_poda(), target);
  }

  // .google.protobuf.Timestamp time_stamp = 4;
  if (this->has_time_stamp()) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(
        4, _Internal::time_stamp(this), target, stream);
  }

  // repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;
  for (unsigned int i = 0,
      n = static_cast<unsigned int>(this->_internal_public_entries_size()); i < n; i++) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(5, this->_internal_public_entries(i), target, stream);
  }

  // repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;
  for (unsigned int i = 0,
      n = static_cast<unsigned int>(this->_internal_confidential_entries_size()); i < n; i++) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(6, this->_internal_confidential_entries(i), target, stream);
  }

  // repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;
  for (unsigned int i = 0,
      n = static_cast<unsigned int>(this->_internal_coinbase_entries_size()); i < n; i++) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(7, this->_internal_coinbase_entries(i), target, stream);
  }

  // bytes state_root = 8;
  if (this->state_root().size() > 0) {
    target = stream->WriteBytesMaybeAliased(
        8, this->_internal_state_root(), target);
  }

  // int64 delta_number = 9;
  if (this->delta_number() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteInt64ToArray(9, this->_internal_delta_number(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields(), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:Catalyst.Protocol.Deltas.Delta)
  return target;
}

size_t Delta::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:Catalyst.Protocol.Deltas.Delta)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // repeated .Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;
  total_size += 1UL * this->_internal_public_entries_size();
  for (const auto& msg : this->public_entries_) {
    total_size +=
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(msg);
  }

  // repeated .Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;
  total_size += 1UL * this->_internal_confidential_entries_size();
  for (const auto& msg : this->confidential_entries_) {
    total_size +=
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(msg);
  }

  // repeated .Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;
  total_size += 1UL * this->_internal_coinbase_entries_size();
  for (const auto& msg : this->coinbase_entries_) {
    total_size +=
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(msg);
  }

  // bytes previous_delta_dfs_hash = 1;
  if (this->previous_delta_dfs_hash().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::BytesSize(
        this->_internal_previous_delta_dfs_hash());
  }

  // bytes merkle_root = 2;
  if (this->merkle_root().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::BytesSize(
        this->_internal_merkle_root());
  }

  // bytes merkle_poda = 3;
  if (this->merkle_poda().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::BytesSize(
        this->_internal_merkle_poda());
  }

  // bytes state_root = 8;
  if (this->state_root().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::BytesSize(
        this->_internal_state_root());
  }

  // .google.protobuf.Timestamp time_stamp = 4;
  if (this->has_time_stamp()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
        *time_stamp_);
  }

  // int64 delta_number = 9;
  if (this->delta_number() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::Int64Size(
        this->_internal_delta_number());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

void Delta::MergeFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:Catalyst.Protocol.Deltas.Delta)
  GOOGLE_DCHECK_NE(&from, this);
  const Delta* source =
      ::PROTOBUF_NAMESPACE_ID::DynamicCastToGenerated<Delta>(
          &from);
  if (source == nullptr) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:Catalyst.Protocol.Deltas.Delta)
    ::PROTOBUF_NAMESPACE_ID::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:Catalyst.Protocol.Deltas.Delta)
    MergeFrom(*source);
  }
}

void Delta::MergeFrom(const Delta& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:Catalyst.Protocol.Deltas.Delta)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  public_entries_.MergeFrom(from.public_entries_);
  confidential_entries_.MergeFrom(from.confidential_entries_);
  coinbase_entries_.MergeFrom(from.coinbase_entries_);
  if (from.previous_delta_dfs_hash().size() > 0) {

    previous_delta_dfs_hash_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.previous_delta_dfs_hash_);
  }
  if (from.merkle_root().size() > 0) {

    merkle_root_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.merkle_root_);
  }
  if (from.merkle_poda().size() > 0) {

    merkle_poda_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.merkle_poda_);
  }
  if (from.state_root().size() > 0) {

    state_root_.AssignWithDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), from.state_root_);
  }
  if (from.has_time_stamp()) {
    _internal_mutable_time_stamp()->PROTOBUF_NAMESPACE_ID::Timestamp::MergeFrom(from._internal_time_stamp());
  }
  if (from.delta_number() != 0) {
    _internal_set_delta_number(from._internal_delta_number());
  }
}

void Delta::CopyFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:Catalyst.Protocol.Deltas.Delta)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void Delta::CopyFrom(const Delta& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:Catalyst.Protocol.Deltas.Delta)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool Delta::IsInitialized() const {
  return true;
}

void Delta::InternalSwap(Delta* other) {
  using std::swap;
  _internal_metadata_.Swap(&other->_internal_metadata_);
  public_entries_.InternalSwap(&other->public_entries_);
  confidential_entries_.InternalSwap(&other->confidential_entries_);
  coinbase_entries_.InternalSwap(&other->coinbase_entries_);
  previous_delta_dfs_hash_.Swap(&other->previous_delta_dfs_hash_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
    GetArenaNoVirtual());
  merkle_root_.Swap(&other->merkle_root_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
    GetArenaNoVirtual());
  merkle_poda_.Swap(&other->merkle_poda_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
    GetArenaNoVirtual());
  state_root_.Swap(&other->state_root_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
    GetArenaNoVirtual());
  swap(time_stamp_, other->time_stamp_);
  swap(delta_number_, other->delta_number_);
}

::PROTOBUF_NAMESPACE_ID::Metadata Delta::GetMetadata() const {
  return GetMetadataStatic();
}


// @@protoc_insertion_point(namespace_scope)
}  // namespace Deltas
}  // namespace Protocol
}  // namespace Catalyst
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::Catalyst::Protocol::Deltas::DeltaIndex* Arena::CreateMaybeMessage< ::Catalyst::Protocol::Deltas::DeltaIndex >(Arena* arena) {
  return Arena::CreateInternal< ::Catalyst::Protocol::Deltas::DeltaIndex >(arena);
}
template<> PROTOBUF_NOINLINE ::Catalyst::Protocol::Deltas::Delta* Arena::CreateMaybeMessage< ::Catalyst::Protocol::Deltas::Delta >(Arena* arena) {
  return Arena::CreateInternal< ::Catalyst::Protocol::Deltas::Delta >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>