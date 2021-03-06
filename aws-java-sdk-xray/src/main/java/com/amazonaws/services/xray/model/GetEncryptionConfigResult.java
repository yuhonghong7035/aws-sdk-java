/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetEncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEncryptionConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The encryption configuration document.
     * </p>
     */
    private EncryptionConfig encryptionConfig;

    /**
     * <p>
     * The encryption configuration document.
     * </p>
     * 
     * @param encryptionConfig
     *        The encryption configuration document.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * The encryption configuration document.
     * </p>
     * 
     * @return The encryption configuration document.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * The encryption configuration document.
     * </p>
     * 
     * @param encryptionConfig
     *        The encryption configuration document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEncryptionConfigResult withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEncryptionConfigResult == false)
            return false;
        GetEncryptionConfigResult other = (GetEncryptionConfigResult) obj;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetEncryptionConfigResult clone() {
        try {
            return (GetEncryptionConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
