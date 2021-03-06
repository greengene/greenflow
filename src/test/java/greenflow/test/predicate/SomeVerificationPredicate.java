/*
   Copyright (c) 2018 GreenGene. (https://github.com/greengene/) All Rights Reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package greenflow.test.predicate;

import greenflow.predicate.Predicate;

public class SomeVerificationPredicate extends Predicate {
	private String firstName;
	private String lastName;
	private String sSN;

	public SomeVerificationPredicate(String firstName, String lastName, String sSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sSN = sSN;
	}

	@Override
	public boolean isSatisfied() {
		if (firstName.equals("John") && lastName.equals("Smith") && sSN.equals("12345")) {
			return true;
		}
		return false;
	}

	@Override
	public String getSymbolicName() {
		return "some-verification-predicate";
	}
}