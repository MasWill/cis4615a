// Rule 03 Numeric types and operations
// NUM03 - Use integer types that can fully represent the possible range of unsigned data

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}