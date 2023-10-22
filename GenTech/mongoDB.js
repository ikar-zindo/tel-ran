 
 
 
 
 
 
 $max
 $min
 $sum
 $avg
 
	// count
	db.users.aggregate(
    [
        { $group: {
            _id: null,
            count: {
                $sum: 1
            }
        }
        }
    ]
)