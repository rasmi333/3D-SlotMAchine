package com.example.slotmachine;

// 4-sided cube
public class Spinner extends Mesh {
	public Spinner(float width, float height, float depth) {
        width  /= 2;
        height /= 2;
        depth  /= 2;
 
        float vertices[] = {
				-width, -0.5f*height, -depth, // [0]  point 0  back
				width, -0.5f*height, -depth, // [1]  point 1
				width,  0.5f*height, -depth, // [2]  point 2
				-width,  0.5f*height, -depth, // [3]  point 3

				width,  1.14f*height, 0, // [4]  point 2 top1
				-width,  1.14f*height, 0, // [5]  point 3
				width,  0.5f*height,  depth, // [6]  point 6
				-width,  0.5f*height,  depth, // [7]  point 7

				width,  1.14f*height, 0, // [8]  point 2 top2
				-width,  1.14f*height, 0, // [9]  point 3
				width,  0.5f*height,  -depth, // [10]  point 6
				-width,  0.5f*height,  -depth, // [11]  point 7

				-width, -0.5f*height,  depth, // [12]  point 4 front
				width, -0.5f*height,  depth, // [13]  point 5
				width,  0.5f*height,  depth, // [14] point 6
				-width,  0.5f*height,  depth, // [15] point 7

				-width, -1.14f*height, 0, // [16] point 0 bottom1
				width, -1.14f*height, 0, // [17] point 1
				-width, -0.5f*height,  -depth, // [18] point 4
				width, -0.5f*height,  -depth, // [19] point 5

				-width, -1.14f*height, 0, // [20] point 0 bottom2
				width, -1.14f*height, 0, // [21] point 1
				-width, -0.5f*height,  depth, // [22] point 4
				width, -0.5f*height,  depth, // [23] point 5
        };

        short indices[] = {
				0,2,1,	//back
				0,3,2,

				7,4,5,  //top
				7,6,4,

				11,9,8,
				11,8,10,   //front

				12,13,14,
				12,14,15,

				17,18,19,
				17,16,18,

				21,23,22,
				21,22,20
        };
     
        // Mapping coordinates for the vertices - this array needs to be same size as vertices array
		float textureCoordinates[] = {
				0.33f, 0.5f,	// vertex [0] back
				0.33f, 1.0f,	// vertex [1]
				0.67f, 1.0f,	// vertex [2]
				0.67f, 0.5f,	// vertex [3]

				0.67f, 0f,	// vertex [4] top1
				0.33f, 0f, // vertex [5]
				0.67f, 0.5f, // vertex [6]
				0.33f, 0.5f, // vertex [7]

				1.0f, 0f,	// vertex [4] top2
				0.66f, 0f, // vertex [5]
				1.0f, 0.5f, // vertex [6]
				0.66f, 0.5f, // vertex [7]

				0.0f, 0.5f, // vertex [8] front
				0.33f, 0.5f, // vertex [9]
				0.33f, 0.0f, // vertex [10]
				0.0f, 0.0f, // vertex [11]

				0.0f, 1.0f, // vertex [12] bottom1
				0.33f, 1.0f, // vertex [13]
				0.0f, 0.5f, // vertex [14]
				0.33f, 0.5f, // vertex [15]

				0.66f, 1.0f, // vertex [12] bottom2
				1.0f, 1.0f, // vertex [13]
				0.66f, 0.5f, // vertex [14]
				1.0f, 0.5f, // vertex [15]
		};   
        
	    setIndices(indices);
        setVertices(vertices);
		setTextureCoordinates(textureCoordinates);
    }
}
