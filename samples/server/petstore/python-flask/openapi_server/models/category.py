from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
import re
from openapi_server import util

import re  # noqa: E501

class Category(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, name=None):  # noqa: E501
        """Category - a model defined in OpenAPI

        :param id: The id of this Category.  # noqa: E501
        :type id: int
        :param name: The name of this Category.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'Category':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Category of this Category.  # noqa: E501
        :rtype: Category
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this Category.


        :return: The id of this Category.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Category.


        :param id: The id of this Category.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this Category.


        :return: The name of this Category.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Category.


        :param name: The name of this Category.
        :type name: str
        """
        if name is not None and not re.search(r'^[a-zA-Z0-9]+[a-zA-Z0-9\.\-_]*[a-zA-Z0-9]+$', name):  # noqa: E501
            raise ValueError("Invalid value for `name`, must be a follow pattern or equal to `/^[a-zA-Z0-9]+[a-zA-Z0-9\.\-_]*[a-zA-Z0-9]+$/`")  # noqa: E501

        self._name = name
