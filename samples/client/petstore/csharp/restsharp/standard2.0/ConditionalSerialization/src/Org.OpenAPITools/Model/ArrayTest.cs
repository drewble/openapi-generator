/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ArrayTest
    /// </summary>
    [DataContract(Name = "ArrayTest")]
    public partial class ArrayTest : IEquatable<ArrayTest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ArrayTest" /> class.
        /// </summary>
        /// <param name="arrayOfString">arrayOfString.</param>
        /// <param name="arrayArrayOfInteger">arrayArrayOfInteger.</param>
        /// <param name="arrayArrayOfModel">arrayArrayOfModel.</param>
        public ArrayTest(List<string> arrayOfString = default(List<string>), List<List<long>> arrayArrayOfInteger = default(List<List<long>>), List<List<ReadOnlyFirst>> arrayArrayOfModel = default(List<List<ReadOnlyFirst>>))
        {
            this._ArrayOfString = arrayOfString;
            if (this.ArrayOfString != null)
            {
                this._flagArrayOfString = true;
            }
            this._ArrayArrayOfInteger = arrayArrayOfInteger;
            if (this.ArrayArrayOfInteger != null)
            {
                this._flagArrayArrayOfInteger = true;
            }
            this._ArrayArrayOfModel = arrayArrayOfModel;
            if (this.ArrayArrayOfModel != null)
            {
                this._flagArrayArrayOfModel = true;
            }
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets ArrayOfString
        /// </summary>
        [DataMember(Name = "array_of_string", EmitDefaultValue = false)]
        public List<string> ArrayOfString
        {
            get{ return _ArrayOfString;}
            set
            {
                _ArrayOfString = value;
                _flagArrayOfString = true;
            }
        }
        private List<string> _ArrayOfString;
        private bool _flagArrayOfString;

        /// <summary>
        /// Returns false as ArrayOfString should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeArrayOfString()
        {
            return _flagArrayOfString;
        }
        /// <summary>
        /// Gets or Sets ArrayArrayOfInteger
        /// </summary>
        [DataMember(Name = "array_array_of_integer", EmitDefaultValue = false)]
        public List<List<long>> ArrayArrayOfInteger
        {
            get{ return _ArrayArrayOfInteger;}
            set
            {
                _ArrayArrayOfInteger = value;
                _flagArrayArrayOfInteger = true;
            }
        }
        private List<List<long>> _ArrayArrayOfInteger;
        private bool _flagArrayArrayOfInteger;

        /// <summary>
        /// Returns false as ArrayArrayOfInteger should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeArrayArrayOfInteger()
        {
            return _flagArrayArrayOfInteger;
        }
        /// <summary>
        /// Gets or Sets ArrayArrayOfModel
        /// </summary>
        [DataMember(Name = "array_array_of_model", EmitDefaultValue = false)]
        public List<List<ReadOnlyFirst>> ArrayArrayOfModel
        {
            get{ return _ArrayArrayOfModel;}
            set
            {
                _ArrayArrayOfModel = value;
                _flagArrayArrayOfModel = true;
            }
        }
        private List<List<ReadOnlyFirst>> _ArrayArrayOfModel;
        private bool _flagArrayArrayOfModel;

        /// <summary>
        /// Returns false as ArrayArrayOfModel should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeArrayArrayOfModel()
        {
            return _flagArrayArrayOfModel;
        }
        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ArrayTest {\n");
            sb.Append("  ArrayOfString: ").Append(ArrayOfString).Append("\n");
            sb.Append("  ArrayArrayOfInteger: ").Append(ArrayArrayOfInteger).Append("\n");
            sb.Append("  ArrayArrayOfModel: ").Append(ArrayArrayOfModel).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as ArrayTest).AreEqual;
        }

        /// <summary>
        /// Returns true if ArrayTest instances are equal
        /// </summary>
        /// <param name="input">Instance of ArrayTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArrayTest input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ArrayOfString != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayOfString.GetHashCode();
                }
                if (this.ArrayArrayOfInteger != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayArrayOfInteger.GetHashCode();
                }
                if (this.ArrayArrayOfModel != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayArrayOfModel.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
