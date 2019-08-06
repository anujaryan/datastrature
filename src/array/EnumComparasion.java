/**
04-Aug-2019
Dell

 * 
 */
package array;

/**
 * @author Dell
 *
 *         8:26:26 pm
 */
public class EnumComparasion {

	public static void main(String[] args) {

		Company al = Company.ALTRON;

		System.out.println(al == Company.ALTRON);
		System.out.println(al.equals(Company.ALTRON));
	}

}

enum Company {

	HCL, ALTRON, FISERV, GOOGLE;

}
