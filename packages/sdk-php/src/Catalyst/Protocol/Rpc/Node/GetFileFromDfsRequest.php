<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.GetFileFromDfsRequest</code>
 */
class GetFileFromDfsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string dfs_hash = 1;</code>
     */
    protected $dfs_hash = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $dfs_hash
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string dfs_hash = 1;</code>
     * @return string
     */
    public function getDfsHash()
    {
        return $this->dfs_hash;
    }

    /**
     * Generated from protobuf field <code>string dfs_hash = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDfsHash($var)
    {
        GPBUtil::checkString($var, True);
        $this->dfs_hash = $var;

        return $this;
    }

}

