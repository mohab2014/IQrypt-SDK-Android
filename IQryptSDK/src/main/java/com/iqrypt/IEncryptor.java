/*  IQrypt - encrypt and query your database

    Copyright(C) 2016 Dotissi Development SRL

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.If not, see http://www.gnu.org/licenses/gpl.txt
    */
package com.iqrypt;

 public interface IEncryptor {
	 String encrypt(Object obj);

	 Object decrypt(String encryptedStr, Class t);

	 byte[] decryptBytes(byte[] encBytes);

	 byte[] encryptBytes(byte[] bytes);
	 Object decrypt(String toDecrypt, Class t, boolean encodingBase16);
	 String encrypt(Object toEncrypt, boolean encodingBase16);
 }
