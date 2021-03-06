# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Deltas.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import Transaction_pb2 as Transaction__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='Deltas.proto',
  package='Catalyst.Protocol.Deltas',
  syntax='proto3',
  serialized_options=b'P\001',
  serialized_pb=b'\n\x0c\x44\x65ltas.proto\x12\x18\x43\x61talyst.Protocol.Deltas\x1a\x11Transaction.proto\x1a\x1fgoogle/protobuf/timestamp.proto\")\n\nDeltaIndex\x12\x0e\n\x06height\x18\x01 \x01(\r\x12\x0b\n\x03\x63id\x18\x02 \x01(\x0c\"\x88\x03\n\x05\x44\x65lta\x12\x1f\n\x17previous_delta_dfs_hash\x18\x01 \x01(\x0c\x12\x13\n\x0bmerkle_root\x18\x02 \x01(\x0c\x12\x13\n\x0bmerkle_poda\x18\x03 \x01(\x0c\x12.\n\ntime_stamp\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x42\n\x0epublic_entries\x18\x05 \x03(\x0b\x32*.Catalyst.Protocol.Transaction.PublicEntry\x12N\n\x14\x63onfidential_entries\x18\x06 \x03(\x0b\x32\x30.Catalyst.Protocol.Transaction.ConfidentialEntry\x12\x46\n\x10\x63oinbase_entries\x18\x07 \x03(\x0b\x32,.Catalyst.Protocol.Transaction.CoinbaseEntry\x12\x12\n\nstate_root\x18\x08 \x01(\x0c\x12\x14\n\x0c\x64\x65lta_number\x18\t \x01(\x03\x42\x02P\x01\x62\x06proto3'
  ,
  dependencies=[Transaction__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_DELTAINDEX = _descriptor.Descriptor(
  name='DeltaIndex',
  full_name='Catalyst.Protocol.Deltas.DeltaIndex',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='height', full_name='Catalyst.Protocol.Deltas.DeltaIndex.height', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='cid', full_name='Catalyst.Protocol.Deltas.DeltaIndex.cid', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=94,
  serialized_end=135,
)


_DELTA = _descriptor.Descriptor(
  name='Delta',
  full_name='Catalyst.Protocol.Deltas.Delta',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='previous_delta_dfs_hash', full_name='Catalyst.Protocol.Deltas.Delta.previous_delta_dfs_hash', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='merkle_root', full_name='Catalyst.Protocol.Deltas.Delta.merkle_root', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='merkle_poda', full_name='Catalyst.Protocol.Deltas.Delta.merkle_poda', index=2,
      number=3, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='time_stamp', full_name='Catalyst.Protocol.Deltas.Delta.time_stamp', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='public_entries', full_name='Catalyst.Protocol.Deltas.Delta.public_entries', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='confidential_entries', full_name='Catalyst.Protocol.Deltas.Delta.confidential_entries', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='coinbase_entries', full_name='Catalyst.Protocol.Deltas.Delta.coinbase_entries', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='state_root', full_name='Catalyst.Protocol.Deltas.Delta.state_root', index=7,
      number=8, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='delta_number', full_name='Catalyst.Protocol.Deltas.Delta.delta_number', index=8,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=138,
  serialized_end=530,
)

_DELTA.fields_by_name['time_stamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_DELTA.fields_by_name['public_entries'].message_type = Transaction__pb2._PUBLICENTRY
_DELTA.fields_by_name['confidential_entries'].message_type = Transaction__pb2._CONFIDENTIALENTRY
_DELTA.fields_by_name['coinbase_entries'].message_type = Transaction__pb2._COINBASEENTRY
DESCRIPTOR.message_types_by_name['DeltaIndex'] = _DELTAINDEX
DESCRIPTOR.message_types_by_name['Delta'] = _DELTA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DeltaIndex = _reflection.GeneratedProtocolMessageType('DeltaIndex', (_message.Message,), {
  'DESCRIPTOR' : _DELTAINDEX,
  '__module__' : 'Deltas_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.Deltas.DeltaIndex)
  })
_sym_db.RegisterMessage(DeltaIndex)

Delta = _reflection.GeneratedProtocolMessageType('Delta', (_message.Message,), {
  'DESCRIPTOR' : _DELTA,
  '__module__' : 'Deltas_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.Deltas.Delta)
  })
_sym_db.RegisterMessage(Delta)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
