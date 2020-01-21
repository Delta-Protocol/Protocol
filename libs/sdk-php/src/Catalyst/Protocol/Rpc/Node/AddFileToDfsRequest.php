<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.Rpc.Node.AddFileToDfsRequest</code>
 */
class AddFileToDfsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>uint64 file_size = 1;</code>
     */
    private $file_size = 0;
    /**
     * <code>string file_name = 2;</code>
     */
    private $file_name = '';
    /**
     * <code>string node = 3;</code>
     */
    private $node = '';

    public function __construct() {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct();
    }

    /**
     * <code>uint64 file_size = 1;</code>
     */
    public function getFileSize()
    {
        return $this->file_size;
    }

    /**
     * <code>uint64 file_size = 1;</code>
     */
    public function setFileSize($var)
    {
        GPBUtil::checkUint64($var);
        $this->file_size = $var;
    }

    /**
     * <code>string file_name = 2;</code>
     */
    public function getFileName()
    {
        return $this->file_name;
    }

    /**
     * <code>string file_name = 2;</code>
     */
    public function setFileName($var)
    {
        GPBUtil::checkString($var, True);
        $this->file_name = $var;
    }

    /**
     * <code>string node = 3;</code>
     */
    public function getNode()
    {
        return $this->node;
    }

    /**
     * <code>string node = 3;</code>
     */
    public function setNode($var)
    {
        GPBUtil::checkString($var, True);
        $this->node = $var;
    }

}
