// Que link: https://leetcode.com/problems/peeking-iterator/
// 284. Peeking Iterator


class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> iter = null;
    Integer next = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    iter = iterator;
        if(hasNext()) next = iter.next();
	}
	
	public Integer peek() {
        return next;
	}
	
	@Override
	public Integer next() {
	    Integer currVal = next;
        if(iter.hasNext()) 
            next = iter.next();
        else 
            next = null;
        return currVal;
	}
	
	@Override
	public boolean hasNext() {
	    return next != null || iter.hasNext();
	}
}